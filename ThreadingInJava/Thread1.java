public class Thread1 {
    /*
     * thread = A thread of execution in a program (kind of like a virtual CPU)
     * The JVM allows an application to have multiple threads running concurrently
     * Each thread can execute parts of you code in parallel with the main thread
     * Each thread has a priority.
     * Threads with higher priority are executed in preference compared to threads
     * with a lower priority
     * 
     * The Java Virtual Machine continues to execute threads until either of the
     * following occurs
     * 1. The exit method of class Runtime has been called
     * 2. All user threads have died
     * 
     * When a JVM starts up, there is a thread which calls the main method
     * This thread is called “main”
     * 
     * Daemon thread is a low priority thread that runs in background to perform
     * tasks such as garbage collection
     * JVM terminates itself when all user threads (non-daemon threads) finish their
     * execution
     */

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());  // It will return active number of running threads

        // Thread.currentThread().setName("This is main thread");  // used to change the name of the main thread
        System.out.println("Thread Name: " + Thread.currentThread().getName());        // To get the name 

        // Priority on the scale from 1 to 10
        Thread.currentThread().setPriority(10);         // Used to change the priority of the thread
        System.out.println("Thread Priority " + Thread.currentThread().getPriority());   // To get the priority

        // Dead or alive
        System.out.println(Thread.currentThread().isAlive() ? "Current Thread is alive": "Current Thread is dead");

        // Pausing the execution time for thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("count is " + i);
            Thread.sleep(1000);
        }

        System.out.println("Completed counting");
    }

}
