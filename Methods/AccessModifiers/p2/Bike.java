package AccessModifiers.p2;

import AccessModifiers.p1.Vehicle;

public class Bike extends Vehicle {
    void showSpeed() {
        speed = 100;    // this is allowed: because it is a subclass in diff package
        System.out.println("Speed: " + speed);
    }
    
}
