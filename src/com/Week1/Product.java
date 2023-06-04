package com.Week1;

public class Product {
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(int qunatity) {
        return price*qunatity;
    }
    public static void main(String[] args){
        Product p =new Product();
       p.setPrice(5.5);
        System.out.println(p.getPrice());
        System.out.println(p.getPrice(5));

    }

}

