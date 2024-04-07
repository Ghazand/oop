package inner_Outer;

public class newFile {
    
    public static void main (String args[])
    {
        OuterClass myOuter = new OuterClass();
        OuterClass.innerclass myInner = myOuter.new innerclass();
        System.out.println("i am from inner class value ="+myInner.y +"i am from outer class value ="+ myOuter.x);
    }
}
