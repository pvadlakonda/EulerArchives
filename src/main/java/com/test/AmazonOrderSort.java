package com.test;

import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(primeOrders, (s1, s2) -> {

            String order1 = s1.substring(s1.indexOf(" ") + 1);
            String order2 = s2.substring(s2.indexOf(" ") + 1);

            if (!order1.equals(order2)) {
                return order1.compareTo(order2);
            }

            return s1.compareTo(s2);
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
