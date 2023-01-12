package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(1,2));
        System.out.println(p.product(1,2,3));
        System.out.println(p.product(1.5,5.5));
    }
}

class Product {
    public int product(int x, int y) {
        return x;
    }
    public int product(int x, int y, int z) {
        return x;
    }
    public double product(double x, double y) {
        return x;
    }
}