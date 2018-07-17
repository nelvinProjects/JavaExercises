package ExerciseTwo;

import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> myVehicles = new ArrayList<>();
    public int bill;

    public void setup() {
        Car car1 = new Car(5, 4);
        Car car2 = new Car(4, 3);
        Motorcycle bike1 = new Motorcycle(2, 2);
        Motorcycle bike2 = new Motorcycle(3, 3);
        Boat boat1 = new Boat("Fishing", 5);
        Boat boat2 = new Boat("Dinghy", 5);
        myVehicles.add(car1);
        myVehicles.add(car2);
        myVehicles.add(bike1);
        myVehicles.add(bike2);
        myVehicles.add(boat1);
        myVehicles.add(boat2);
    }

    public void calculateBill() {
        for (Vehicle i : myVehicles) {
            if (i instanceof Car) {
                bill += 2;
            } else if (i instanceof Motorcycle) {
                bill += 3;
            } else if (i instanceof Boat) {
                bill += 4;
            }
        }

        System.out.println("£" + bill);
    }

    public void add(Vehicle vehicle) {
        myVehicles.add(vehicle);
    }

    public void remove(Vehicle vehicle) {
        myVehicles.remove(vehicle);
    }


}
