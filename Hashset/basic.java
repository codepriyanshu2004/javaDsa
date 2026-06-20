package Hashset;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        
   
    int [] arr = {1,2,3,2,4,1};
   // find unique element
   
   HashSet<Integer>set = new HashSet<>();

   for(int ele:arr){
      set.add(ele);
   }

     for(int ele:set){
     System.out.println(ele);
   }


    
}
}