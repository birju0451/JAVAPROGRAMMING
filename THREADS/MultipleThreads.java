package THREADS;
class A extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MultipleThreads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        //System.out.println(obj1.getName());
        //obj2.setPriority(Thread.MAX_PRIORITY);
        
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
