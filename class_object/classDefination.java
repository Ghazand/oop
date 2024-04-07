package class_object;
// here every thing is giving constructor method overloading,static method
// result shows clear output accordingly
// static method does not required object creation of creation we can call it withouut creation of class

// overloading of method in yahoo with different parameters,
public class classDefination {
    //no return type must be same name as class 
    public classDefination(){
        System.out.println("this message is from constructor");
    }
    public void yahoo(){
        System.out.println("this is method");
    }
    public void yahoo(int age){
        System.out.println("This is method overloading and age is "+age);
    }
    public static void methodStatic(){
        System.out.println("This is static method message");
    }


}
//  javac class_object/classDefination.java
//  javac class_object/mainFile.java
//  java class_object/mainFile.java

// This is static method message
// this message is from constructor
// this is method
// This is method overloading and age is 20

 
//  java class_object/mainFile.java
// this message is from constructor
// this is method
// This is method overloading and age is 20