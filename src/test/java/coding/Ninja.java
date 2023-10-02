package coding;

public class Ninja {
    public static void main(String[] args) {
        String name = "Ninja";
        System.out.println("vehicle ref vehicle obj");
        Vehicle v = new Vehicle();
        v.move(name);
        System.out.println("vehicle ref bike obj");
        Vehicle b = new Bike();
        b.move(name);
        System.out.println("bike ref bike obj");
        Bike b1 = new Bike();
        b1.move(name);
    }
}
