package interface_example;
// Another way to achieve abstraction in Java, is with interfaces.
// An interface is a completely "abstract class" that is used to group related methods with empty bodies:
// The body of the interface method is provided by the "implement" class
// On implementation of an interface, you must OVERRIDE all of its methods
// An interface cannot contain a constructor (as it cannot be used to create objects)
// Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, 
// because the class can implement multiple interfaces.
public interface Animal {
    public void sound();
    public void bread();
}

//  jani$ javac interface_example/Animal.java
//  jani$ javac interface_example/Dog.java
//  jani$ javac interface_example/mainFile.java
//  jani$ java interface_example/mainFile.java
// this is interface of animal and my sound is haaha
// this is interface of animal and my bread  is german