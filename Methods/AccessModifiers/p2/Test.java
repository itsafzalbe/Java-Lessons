package AccessModifiers.p2;

// import p1.Vehicle;

public class Test {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.showSpeed();
        // Vehicle v = new Vehicle();
        // System.out.println(v.speed); // ERROR: cannot access protected outside package & non-subclass


    }

    
}
