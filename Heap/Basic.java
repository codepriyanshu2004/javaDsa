import java.util.*;

public class Basic {

    public static void main(String[] args){
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap

        // int [] arr = {4,23,5,2,6,1};
        // for(int i=0;i<arr.length;i++){
        //     pq.add(arr[i]);
        // }

        // System.out.println(pq);
        // System.out.println(pq.peek());
        // System.out.println(pq.poll());
        // System.out.println(pq);
        // System.out.println(pq.peek());
        // System.out.println(pq.size());
        // System.out.println(pq.isEmpty());

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }

        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

          int [] arr = {3,5,6,2,8,10,23};

          for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
          }

          System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


    }
}