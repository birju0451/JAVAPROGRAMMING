package THREADS;
class A implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class runnable {
    public static void main(String[] args) {
        Runnable  obj1=new A();
        Runnable  obj2=new B();

        //System.out.println(obj1.getName());
        //obj2.setPriority(Thread.MAX_PRIORITY);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
