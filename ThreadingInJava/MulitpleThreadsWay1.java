class MyThread extends Thread {
    @Override
    public void run() {
        // This method will be executed for this thread
        System.out.println(Thread.currentThread().getName() + " thread is running");
    }
}

public class MulitpleThreadsWay1 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        MyThread thread2 = new MyThread();
        thread2.start();

        thread2.setName("thread-2");
        System.out.println("Thread Name: " + thread2.getName());

        System.out.println(thread2.isAlive() ? thread2.getName() + " thread is alive": thread2.getName() + "  thread is dead");
        

        // The priority of the thread is inherited from the parent thread, default priority will be 5
        System.out.println(thread2.getPriority());  // priority of thread-2 is 10
    }
}