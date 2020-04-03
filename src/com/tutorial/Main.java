package com.tutorial;

import com.tutorial.collections.CollectionsDemo;
import com.tutorial.generics.GenericsList;
import com.tutorial.models.Customer;
import com.tutorial.models.EmailComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var myList = new GenericsList<Integer>();
        myList.add(12);
        int test = myList.get(0);

        var user1 = new User(10);
        var user2=new User(20);
        if (user1.compareTo(user2)<0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) >1)
            System.out.println("user1 > user2");
        else
            System.out.println("user1 == user2");

        var user = Utilities.max(user1,user2);

        //Wild cards
        var instructors = new GenericsList<Instructor>();
        var users = new GenericsList<User>();

        Utilities.printUsers(instructors);

        users.add(user1);
        users.add(user2);
        for (var userInusers:users) {
            System.out.println(userInusers);
        }

        //Collections
        CollectionsDemo.show();

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e2"));
        customers.add(new Customer("a", "e3"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers);
        System.out.println(customers);
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
