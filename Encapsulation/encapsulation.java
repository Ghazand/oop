package Encapsulation;
// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
// To achieve this, must follow:
// declare class variables/attributes as private
// provide public get and set methods to access and update the value of a private variable
// Better control of class attributes and methods
// Class attributes can be made read-only (if you only use the get method), 
// or write-only (if you only use the set method)
public class encapsulation {
    private int amount;
      // Getter
  public int getAmount() {
    return amount;
  }

  // Setter
  public void setAmount(int newAmount) {
    this.amount = newAmount;
  }

    
}


// javac Encapsulation/encapsulation.java

//  javac Encapsulation/mainFile.java

//  java Encapsulation/mainFile.java
// 100