package com.tutorial.lambdas;

public class LambdasDemo {

    public static void show(){
        var prefix = "-";
        greet(message -> System.out.println(prefix + message));
    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
