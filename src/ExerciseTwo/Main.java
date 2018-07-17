package ExerciseTwo;

public class Main {
    public static void main(String[] args) {
        AppTwo level2 = new AppTwo();
//        System.out.println("Blackjack: " + level2.blackjack(23, 1));
//        System.out.println("Blackjack: " + level2.blackjack(1, 23));
//        System.out.println("Blackjack: " + level2.blackjack(21, 20));
//        System.out.println("Blackjack: " + level2.blackjack(19, 18));
//        System.out.println("Blackjack: " + level2.blackjack(0, 0));
//        System.out.println("Blackjack: " + level2.blackjack(24, 30));
//
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 2, 3));
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 1, 3));
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 2, 2));
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 1, 1));
//
//        System.out.println("Too Hot: "+ level2.tooHot(60,true));
//        System.out.println("Too Hot: "+ level2.tooHot(100,true));
//        System.out.println("Too Hot: "+ level2.tooHot(50,true));
//        System.out.println("Too Hot: "+ level2.tooHot(120,true));
//        System.out.println("Too Hot: "+ level2.tooHot(60,false));
//        System.out.println("Too Hot: "+ level2.tooHot(90,false));
//        System.out.println("Too Hot: "+ level2.tooHot(91,false));

//        People person1 = new People("Tim", 25, "Chef");
//        People person2 = new People("Sim", 28, "Painter");
//        People person3 = new People("Nim", 29, "Driver");
//        People person4 = new People("Lim", 24, "Waiter");
//        People person5 = new People("Wim", 30, "Trainee");
//
//        level2.storePeople.add(person1);
//        level2.storePeople.add(person2);
//        level2.storePeople.add(person3);
//        level2.storePeople.add(person4);
//        level2.storePeople.add(person5);
//
//        for (People i : level2.storePeople){
//            System.out.println(i.toString());
//        }
//
//        System.out.println(level2.findPerson("Lim"));

        Garage garage = new Garage();
        garage.setup();
        garage.calculateBill();
        garage.add(new Car(7, 6, 6));
        System.out.println(garage.fix(2));
        System.out.println("Before removing vehicle" + garage.myVehicles.size());
        garage.remove(1);
        System.out.println("After removing vehicle" + garage.myVehicles.size());
        garage.emptyGarage();
        System.out.println("Remove all vehicle" + garage.myVehicles.size());
    }
}
