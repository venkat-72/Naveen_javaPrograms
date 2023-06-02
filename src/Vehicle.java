 class Truck {
    void move(){
        System.out.println("Moving fast");
    }
}

class Car extends Truck {
    void move() {
        System.out.println("Moving slow");
    }

}

public class Vehicle {
    public static void main(String[] args) {
        Truck c = new Truck();
        Truck m = new Car();
        c.move();
        m.move();
    }
}
