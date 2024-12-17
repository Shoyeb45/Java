// package ThreadingInJava;
import java.lang.Thread;

public class Ex1 {
    public static void main(String...args) throws InterruptedException {
        System.out.println("MultiThreading Example");
        
        System.out.println("Man : I am thread : " + Thread.currentThread().getName());
        
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside thread : " + Thread.currentThread().getName());
        });
        

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside thread: " + Thread.currentThread().getName());
        });

        t1.setName("Shoyeb");
        t2.setName("Asutosh");
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        Thread.sleep(2000);
        System.out.println("End of Main");
        
    }
}
