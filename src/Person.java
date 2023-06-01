public class Person {
    int age;
    float weight;
    float height;

    double caluclateBMI(){
        return weight/(weight*height);
    }
    void walk(){
        System.out.println("person is walking");
    }
}
