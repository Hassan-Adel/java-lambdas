package com.tutorial;

import com.tutorial.lambdas.Printer;
import com.tutorial.lambdas.ConsolePrinter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //lambda expression
        greet((String message)->{
            System.out.println("Hello world");
        });

        greet((message)->{
            System.out.println("Hello world");
        });

        //only with single parameter
        greet(message->{
            System.out.println("Hello world");
        });

        //if method body has a single line of code
        greet(message-> System.out.println("Hello world"));

        //add lambda expression to a parameter
        Printer printer = message -> System.out.println("Hello world");

        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Hello world");
            }
        });;
    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
