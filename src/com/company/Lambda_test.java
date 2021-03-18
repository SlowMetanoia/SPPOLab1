package com.company;

import java.util.function.Function;

public class Lambda_test {
    public Function<Integer,Boolean> f;
    public boolean exec(int a)
    {
        return f.apply(a);
    }
}
