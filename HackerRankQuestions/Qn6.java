package HackerRankQuestions;

// Base class
class Vehicle {
    void description() {
        System.out.println("I am a vehicle with pedals.");
    }
}

// Subclass of Vehicle
class Cycle extends Vehicle {
    @Override
    void description() {
        System.out.println("I am a cycle with an engine.");
        super.description(); // Calls the method from the Vehicle class
    }
}

// Subclass of Cycle
class Motorcycle extends Cycle {
    @Override
    void description() {
        System.out.println("Hello I am a motorcycle,");
        super.description(); // Calls the method from the Cycle class
    }
}

public class Qn6 {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.description();
    }
}
