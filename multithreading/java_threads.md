## Java Threads

java thread is like a virtual CPU that can execute code inside of our java application.

The java main method that we run, is actually executed by a thread when the JVM starts the application.

There is two ways to create Threads:
1. Extending the Thread Class
2. Implementing the Runnable Interface. But there are three ways to do that:
    * create a java class that implements the Runnable interface
    * create an anonymous class that implements the runnable interface
    * create a java lambda that implements the runnable interface.


```
public static class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread "  + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        int n = 8;
        for (int i=0; i<n; i++) {
            Thread thread = new Thread();
            thread.start()    
        }
    }
}
```
inside of the main method we created a new thread. This start() makes the thread runs
parallel to the main method.

### When to use the Interface and when to use the Class?
* As we know that java doesn't support multiple inheritance, If we use the Thread class, we will not able to extend any 
other class. But we can use the inbuilt methods which is not available using the runnable interface.
* If we implement the runnable interface, we can extend other classes.

---
