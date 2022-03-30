package com.example;

public class MyOptions {

    static {
        System.out.println("******MY OPTIONS*****. This class gets initialized at build time");
    }

    public static void printHello(){
        System.out.println("HELLO from MyOptions");
    }
}
