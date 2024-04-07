package inheritance;
// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from
// - It is useful for code reusability: 
// reuse attributes and methods of an existing class when you create a new class.

public class Animal {
    int age;
    String color;
    public void sound(){
        System.out.println("that is animal sound");
    }
}
//  javac inheritance/Animal.java
//  javac inheritance/Dog.java
// (base) janis-MacBook-Pro:oop jani$ javac inheritance/mainFile.java
//  java inheritance/mainFile.java
// that is animal sound
// that is dog sound in child classcolor is greeenage is 14