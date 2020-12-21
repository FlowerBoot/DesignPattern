package com.adoger.singleton;

public class BasicSingleton {
    private static BasicSingleton instance = new BasicSingleton();
    private BasicSingleton(){}
    public static BasicSingleton getInstance() {
        return instance;
    }
}
