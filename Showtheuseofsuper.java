// Parent class
class Animal {
    String name;

    // Constructor of the parent class
    Animal(String name) {
        this.name = name;
    }

    // Method of the parent class
    public void displayInfo() {
        System.out.println("I am an animal named: " + name);
    }
}

// Child class
class Dog extends Animal {
    String breed;

    // Constructor of the child class
    Dog(String name, String breed) {
        // Using super to call the parent class constructor
        super(name);
        this.breed = breed;
    }

    // Method of the child class
    public void displayInfo() {
        // Using super to call the parent class method
        super.displayInfo();
        System.out.println("I am also a dog of breed: " + breed);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Call the method that uses super
        dog.displayInfo();
    }
}
