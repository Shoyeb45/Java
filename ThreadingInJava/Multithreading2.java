class ThreadCreatingMethod1 extends Thread {
    @Override
    public void run() {
        System.out.println("Execution started of thread1");
        
        for (int i = 1; i < 11; i++) {
            System.out.println("Forward counter " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Execution completed of thread1");
    }
}

class ThreadCreatingMethod2 implements Runnable {
    public void run() {
        System.out.println("Execution started of " + Thread.currentThread().getName());
        
        for (int i = 10; i >= 1; i--) {
            System.out.println("Backward counter " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Execution completed of " + Thread.currentThread().getName());
    }
}

public class Multithreading2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadCreatingMethod1 thread1 = new ThreadCreatingMethod1();
        thread1.setName("thread1");

        // The class implementing runnable interface should be passed to the constructor of the Thread class while creating object
        Thread thread2 = new Thread(new ThreadCreatingMethod2());
        thread2.setName("thread2");

        thread1.start();
        // thread1.join();  // calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        thread1.join(3000);  // After 3 second of executing thread1, the execution of thread2 will start
        
        thread2.start();

    }
}