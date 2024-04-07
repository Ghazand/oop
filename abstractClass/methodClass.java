package abstractClass;
// To achieve security - hide certain details and only show the important details of an object.
// it can be done through interfaces also 
// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. 
// The body is provided by the subclass (inherited from). methodClass is parent class and abstractDefination is child
// Abstract class
abstract class methodClass {
    
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("that is abstract class method ssshh");
    }
  }
//   javac abstractClass/methodClass.java
// javac abstractDefination.java
// error: file not found: abstractDefination.java
// Usage: javac <options> <source files>
// use --help for a list of possible options
//  javac abstractClass/abstractDefination.java
//  javac abstractClass/mainClass.java
//  java abstractClass/mainClass.java
// The soud is djdjj
// that is abstract class method ssshh

