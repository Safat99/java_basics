package multithreading;

public class ThreadExample1 {

    public static class MyThread extends Thread {
        public void run() {
            try {
                System.out.println("Thread "  + Thread.currentThread().getName() + " is running");
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
        }
    }

    public static void main(String[] args){
        int n = 8;
        System.out.println("Hi");
        for (int i=0;i<8;i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
        System.out.println("Bye");
        System.out.println("---------");

//        Thread thread = new Thread(  new MyRunnable()  );
//        thread.start();
   }
}
