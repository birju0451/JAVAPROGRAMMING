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


public class RunnableVsthreads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        //System.out.println(obj1.getName());
        //obj2.setPriority(Thread.MAX_PRIORITY);
        Thread t1=new Thread();
        Thread t2= new Thread();
        t1.start();
        t2.start();
    }
}
