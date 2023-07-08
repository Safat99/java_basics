package Queues;


public class QueueScratch {

    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enqueue(int data) {
        queue[rear%5] = data;
        rear++;
        size++;
    }

    public int deQueue() {
        int data = queue[front];
        front++;
        size--;

        return data;
    }

    public void show() {
        System.out.println("Elements: ");
        for (int i=0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
    }

}
