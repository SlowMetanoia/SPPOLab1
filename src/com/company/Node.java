package com.company;

import java.util.NavigableMap;

public class Node<T> {
    final private String name;
    final private String description;
    final private T value;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public T getValue() {
        return value;
    }

    public Node(String name, String description, T value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
