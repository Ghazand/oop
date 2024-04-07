package interface_example;
// Interface methods do not have a body - the body is provided by the "implement" class
// On implementation of an interface, you must override all of its methods
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
// An interface cannot contain a constructor (as it cannot be used to create objects)
// Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved
//  with interfaces, because the class can implement multiple interfaces.
public interface interfaceOne {

    public void methodone();
} 

//  javac interface_example/interfaceOne.java
//  javac interface_example/interfaceTwo.java
//  javac interface_example/multipleInterface.java
// error: file not found: interface_example/multipleInterface.java
// Usage: javac <options> <source files>
// use --help for a list of possible options
//  javac interface_example/mutipleInterface.java
//  javac interface_example/mutipleInterfaceMain.java
// error: file not found: interface_example/mutipleInterfaceMain.java
// Usage: javac <options> <source files>
// use --help for a list of possible options
//  javac interface_example/multiInterfaceMain.java
//  java interface_example/multiInterfaceMain.java

// This is from first interface method
// This is from second interface method
