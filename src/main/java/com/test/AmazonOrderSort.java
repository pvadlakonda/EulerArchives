package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmazonOrderSort {
    public List<String> execute(List<String> orders) {
        List<String> primeOrders = new ArrayList<>();
        List<String> nonPrimeOrders = new ArrayList<>();

        for (String order : orders) {
            if (isPrime(order)) {
                primeOrders.add(order);
            } else {
                nonPrimeOrders.add(order);
            }
        }

        Collections.sort(primeOrders, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] tokens1 = s1.split(" ");
                String[] tokens2 = s2.split(" ");

               for (int i = 1; i < tokens1.length; i++) {
                   if(tokens1[i].equals(tokens2[i])) {
                       continue;
                   } else {
                       return tokens1[i].compareTo(tokens2[i]);
                   }
               }


                return tokens1[0].compareTo(tokens2[0]);
            }
        });

        List<String> sortedOrders = new ArrayList<>();
        sortedOrders.addAll(primeOrders);
        sortedOrders.addAll(nonPrimeOrders);

        return sortedOrders;
    }

    private boolean isPrime(String order) {

        String[] tokens = order.split(" ");

        for (int i =1; i < tokens.length; i++) {
            if(tokens[i].matches("\\d+")) {
                continue;// non prime
            } else {
                return true; // prime
            }
        }
        return false;
    }
}
