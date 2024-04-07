package polymorphism;

public class MainFile {
    public static void main(String args[])
    {
        Animal animal1 = new Dog(); // Upcasting
        animal1.makeSound(); // Output will be "This is dog sound"
        // Compilation error: Animal class doesn't have wagTail method
        // animal1.Tail();

        // Downcasting to access specific methods of Dog class
        Dog dog = (Dog) animal1;
        dog.Tail(); // Output will be "Tail wagging"
    }
}
