package ObserverDesignPattern;

public class Youtube {

    public static void main(String[] args) {

        Channel zidane = new Channel();

        Subscriber s1 = new Subscriber("ronaldo");
        Subscriber s2 = new Subscriber("messi");
        Subscriber s3 = new Subscriber("muller");

        // zidane gets to know who are his subscriber
        zidane.subscribe(s1);
        zidane.subscribe(s2);
        zidane.subscribe(s3);

        zidane.unSubscribe(s3);

        // the subscriber are subscribing zidane
        s1.subscribeChannel(zidane);
        s2.subscribeChannel(zidane);
        s3.subscribeChannel(zidane);

        zidane.upload("how to kick football");


    }
}
