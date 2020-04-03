package com.tutorial;

import com.tutorial.lambdas.Printer;
import com.tutorial.lambdas.ConsolePrinter;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
