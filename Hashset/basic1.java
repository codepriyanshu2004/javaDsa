package Hashset;

import java.util.HashSet;

public class basic1 {
    public static void main(String[] args) {
        
        // detect duplicate
        int [] arr = {1,2,3,2,4,1};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
           if (set.add(arr[i])) {
            
           }else{
              System.out.println(arr[i]);
           }
        }

        
    }
}
