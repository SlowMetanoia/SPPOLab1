package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Lambda_test lmb = new Lambda_test();
        lmb.f = (Integer a)->{
            return a > 7;
        };

        GraphBuilder gb = new GraphBuilder();
        ArrayList<Node<Integer>> nodeArr = new ArrayList<Node<Integer>>();
        for (int i = 0; i < 30; i++) {
            Node<Integer> cur = new Node<Integer>("","",i);
            nodeArr.add(cur);
        }
        Function<Node<Integer>, Boolean> g = (Node<Integer> a) -> {
            return a.getName() == "";
        };
        Consumer<Object> objectPrinter =(Object object)->{
            System.out.println(object);
        };
        Supplier<Long> intGen =()->{
            return (Math.round(Math.random() * 1000));
        };
        gb.addNodes(nodeArr);
        Graph<Integer,Integer> graph = gb.build();
        objectPrinter.accept(graph.filterNodes(g));
        for (int i = 0; i < 150; i++) {
            objectPrinter.accept(intGen.get());
        }
    }
}
