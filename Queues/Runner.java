package Queues;

public class Runner {

    public static void main(String[] args) {
        QueueScratch q = new QueueScratch();
        q.enqueue(5);
        q.enqueue(500);
        q.enqueue(3);
        q.enqueue(51);

        q.show();

        q.deQueue();
        q.deQueue();

        q.enqueue(10);
        q.enqueue(10);
        q.enqueue(10);


        q.show();

    }
}
