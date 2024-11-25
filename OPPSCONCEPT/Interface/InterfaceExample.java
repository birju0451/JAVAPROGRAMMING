package Interface;

interface Animal {
    int eyes = 2; // This is implicitly public, static, and final
    void walk();  // Abstract method
}

interface Herbivore {
    void eats();  // Abstract method
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
    
    public void eats() {
        System.out.println("eats plants");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();  // Output: walks on 4 legs
        horse.eats();  // Output: eats plants
    }
}
