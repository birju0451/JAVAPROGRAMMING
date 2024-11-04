//whenever you get object of a class it will call the constructor of subclass and super class both ,and here A is super class and B is the subclas 



class A{
    public A(){
        System.out.println("in A");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
}

    
public class super1 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        B obj =new B();
    }
}
