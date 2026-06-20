package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class basic4 {

    static boolean occurrences(int[]arr){
        HashMap <Integer,Integer>map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq+1);
                
            }else{
                map.put(arr[i], 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
         for(int key:map.keySet()){
            if (set.add(map.get(key))) {
                
            }else{
                return false;
            }
         }
         return true;
    }
    public static void main(String[] args) {


//   arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// Example 2:

// Input: arr = [1,2]
// Output: false

    int [] arr= {1,2,2,1,1,3};
    int [] arr1 = {1,2};
      boolean ans = occurrences(arr1);
      System.out.println(ans);
    }
    
}
