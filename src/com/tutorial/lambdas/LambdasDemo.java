package com.tutorial.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {

    private String msg;

    public LambdasDemo(String msg) {
        this.msg = msg;
    }

    public void print(String msg){}

    public static void chainingConsumers(){
        List<String> stringList = List.of("a","b","c","d","e");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        stringList.forEach(print.andThen(printUpperCase).andThen(print));
    }

    public static void show(){
        var prefix = "-";
        greet(message -> System.out.println(prefix + message));

        //method reference: same as the above
        //Class/Object :: method
        greet(System.out::println);

        //using objects
        var demo = new LambdasDemo("test");
        greet(message -> demo.print(message));
        greet(demo::print);

        //using constructor
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);

    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
