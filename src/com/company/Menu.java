package com.company;

import java.util.*;
import java.util.function.*;

public class Menu implements IPrintable{
    private HashMap<String, Consumer<String>> menuMap;
    private HashMap<String, String> descriptions;
    void Read() {
        Scanner input = new Scanner(System.in);
        menuMap.get(input.nextLine()).accept(input.nextLine());
    }
    void AddOption(String str,String description,Consumer<String> consumer) {
        menuMap.put(str,consumer);
        descriptions.put(str,description);
    }
    @Override
    public String getContent() {
        String result = new String();
        for (String str:menuMap.keySet()) {
            result = result + str + "\t" + descriptions.get(str) + "\n";
        }
        return result;
    }
}