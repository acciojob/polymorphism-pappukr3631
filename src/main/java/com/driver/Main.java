package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int i = p.product(1, 2);
        int j = p.product(1,2,3);
        double k = p.product(1.5,5.5);
        System.out.println(i + " " + j + " " + k);
    }
}

