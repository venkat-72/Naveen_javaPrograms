package com.Week1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        Male p=new Male();
        p.walk();

        Truck c = new Truck();
        Truck m = new Car();
        c.move();
        m.move();

        Section s=new Section();
        s.getDepartmentSize();


        Product price =new Product();
        price.setPrice(5.5);
        System.out.println(price.getPrice());
        System.out.println(price.getPrice(5));

        Store money = new Store();
        money.processMoney(9.99);
        money.sendNotify("money sent");


        Bike b = new Bike("Tesla" , "BMW 1250");
        Bike b1 = new Bike("kawasaki");


        System.out.println(Sample.value);


        Finalclass val= new Finalclass();
        val.finalMethod();


    }
}