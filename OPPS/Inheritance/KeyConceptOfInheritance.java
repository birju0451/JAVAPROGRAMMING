package OPPS.Inheritance;

import javax.crypto.spec.PSource;

//method overloading :
/*
>A subclass can override a method of the superclass to provide  a specific implementation.
>use the @override annotation to make it clear that you're overriding a method
 */
@SuppressWarnings("unused")
class animal{
    public void sound(){
        System.out.println("Animal makes a sound ");
    }
}
class dog extends animal{
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dogs barks");
    }
}
public class KeyConceptOfInheritance {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.sound();

    }
}
