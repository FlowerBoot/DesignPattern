package com.adoger.singleton;

public class SimpleSingleton {
    //创建 SingleObject 的一个对象
    private static SimpleSingleton instance = new SimpleSingleton();

    //让构造函数为 private，这样该类就不会被实例化
    private SimpleSingleton(){}

    //获取唯一可用的对象
    public static SimpleSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
