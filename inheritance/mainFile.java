package inheritance;

public class mainFile {
    
    public static void main(String args[])
    {
        Animal animal=new Animal();
        animal.sound();
        Dog dog = new Dog();
        // dog.age=14;
        // dog.color="greeen";
        dog.makesound(14,"greeen");

    }
}
