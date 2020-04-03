package com.tutorial;

import com.tutorial.collections.CollectionsDemo;
import com.tutorial.generics.GenericsList;
import com.tutorial.interfaces.Printer;
import com.tutorial.lambdas.ConsolePrinter;
import com.tutorial.models.Customer;
import com.tutorial.models.EmailComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        greet(new ConsolePrinter());;
    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
