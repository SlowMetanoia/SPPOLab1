package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MenuFabric {
    MenuFabric()
    {
    }
    Menu createMenu(boolean isDefault) {
        Menu result = new Menu();
        if(isDefault)
        {
            result.AddOption("SetNewNode","...",(String str)->{
                String[] StringArr = str.split(" ");

            });
        }
        return result;
    }
}
