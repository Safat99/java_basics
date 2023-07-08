/*
given llist ==> [10,20,30,40]
add Front ==> 5

output = [5,10,20,30,40]
*/

import java.util.LinkedList;
import java.util.Arrays;

public class insertion {

    static void push(LinkedList given_llist,int data) {
        given_llist.addFirst(data);
    }



    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println("given LL is :" + nums);

        int data = 5;

        push(nums, data);

        System.out.println("given LL become :" + nums);

    }
}