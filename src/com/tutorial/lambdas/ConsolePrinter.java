package com.tutorial.lambdas;

import com.tutorial.interfaces.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
