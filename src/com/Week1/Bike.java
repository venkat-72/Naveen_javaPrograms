package com.Week1;

// class Bike extends Carnew {
//    private String bikename;
//
//    public Bike(String name,String bikename){
//        super(Carnew);
//        this.bikename=bikename;
//    }
//    public Bike(String bikename){
//       this.bikename= bikename;
//    }
//}
class Bike extends Carnew{
    private String bikename;

    public Bike(String name,String bikename) {
        super(name);
        this.bikename = bikename;
        System.out.println(name);
        System.out.println(bikename);

    }

    public Bike(String bikename){

        this.bikename = bikename;
        System.out.println(bikename);


    }
}