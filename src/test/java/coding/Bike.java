package coding;

public class Bike extends Vehicle {
    @Override
    public void move(String name) {
        System.out.println(name + " is moving" + " from bike");
    }
}
