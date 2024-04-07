package polymorphism;
// Inheritance lets us inherit attributes and methods from another class. 
// Polymorphism uses those methods to perform different tasks. 
// This allows us to perform a single action in different ways.
// Animal is the base class with a makeSound method. 
// Dog is derived class that override the makeSound method
// At runtime, the JVM determines which version of the makeSound method to call based 
// on the actual type of the object. This is runtime polymorphism.
// here you must notice calling in the mainFile downcasting especially!! 
public class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
    
}

//  javac polymorphism/Animal.java
//  javac polymorphism/Dog.java
//  javac polymorphism/MainFile.java
//  java polymorphism/MainFile.java
// This is dog sound
// Dog has no tail