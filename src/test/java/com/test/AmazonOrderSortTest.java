package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AmazonOrderSortTest {
    private AmazonOrderSort solution = new AmazonOrderSort();

    @Test
    void shouldReturnPrimeOrdersFirst() {

        List<String> orders = new ArrayList<>();
        orders.add("we3 123 545 234");
        orders.add("ere echo dot");
        orders.add("erc echo dot");
        orders.add("ad 324 34 4355");
        orders.add("pri apple watch");
        orders.add("pri kindle");

        List<String> sortedOrders = solution.execute(orders);

        assertEquals("pri apple watch", sortedOrders.get(0));
        assertEquals("erc echo dot", sortedOrders.get(1));
        assertEquals("ere echo dot", sortedOrders.get(2));
        assertEquals("pri kindle", sortedOrders.get(3));
        assertEquals("we3 123 545 234", sortedOrders.get(4));
        assertEquals("ad 324 34 4355", sortedOrders.get(5));
    }

    @Test
    void testPrimeOrdersOnly() {

        List<String> orders = new ArrayList<>();
        orders.add("ere echo dot");
        orders.add("erc echo dot");
        orders.add("pri apple watch");
        orders.add("pri kindle");

        List<String> sortedOrders = solution.execute(orders);

        assertEquals("pri apple watch", sortedOrders.get(0));
        assertEquals("erc echo dot", sortedOrders.get(1));
        assertEquals("ere echo dot", sortedOrders.get(2));
        assertEquals("pri kindle", sortedOrders.get(3));
    }

    @Test
    void testNonPrimeOrdersOnly() {

        List<String> orders = new ArrayList<>();
        orders.add("we3 123 545 234");
        orders.add("ad 324 34 4355");

        List<String> sortedOrders = solution.execute(orders);

        assertEquals("we3 123 545 234", sortedOrders.get(0));
        assertEquals("ad 324 34 4355", sortedOrders.get(1));
    }
}