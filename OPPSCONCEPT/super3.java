
//1.whenever you get object of a class it will call the constructor of subclass and super class both ,and here A is super class and B is the subclas 
//2.every constructor in java have a method which is there there even if we don't mension and that method is called super class
class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super(10);
        System.out.println("in B");
    }

    public B(int n){
        super(10);
        System.out.println("in B int ");
    }
}

    
public class super3 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        B obj =new B();
    }
}
