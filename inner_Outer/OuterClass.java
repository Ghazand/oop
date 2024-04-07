package inner_Outer;
// The purpose of nested classes(class within) is to group classes that belong together,
//  which makes your code more readable and maintainable.
// it can different identifier, public , private , protected,
// you can access from outer class inner class also


public class OuterClass {
 public int x= 4; 
    public class innerclass{

        public int y =9;
    }
}

//  javac inner_Outer/OuterClass.java
//  javac inner_Outer/newFile.java
//  java inner_Outer/newFile.java
// i am from inner class value =9i am from outer class value =4