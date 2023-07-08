package SignletonDesignPattern;

public class SingletonMain {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj = Singleton.getInstance();
            }
        });

        Singleton obj1 = Singleton.getInstance();

    }
}
