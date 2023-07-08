package Queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithCollection {

    /*
    *add vs offer
    * add method throws exception
    * but offer() returns false
    * in the case of failure
    */

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<String> qs = new PriorityQueue<>(Collections.reverseOrder());
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(30);

        qs.offer("safat");
        qs.offer("rafat");
        qs.offer("arafat");


        System.out.println(q);
//        while(!q.isEmpty()) {
//            System.out.println(q.poll());
//        }
//        System.out.println(q);

        System.out.println(qs);
    }
}
