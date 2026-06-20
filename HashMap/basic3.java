package HashMap;

import java.util.HashMap;

public class basic3 {

   static int [] twosum(int [] arr,int target){
      HashMap<Integer,Integer> map = new HashMap<>();
        int [] ans = new int[2];
      for(int i=0;i<arr.length;i++){
         int remaining = target -arr[i];
          
         if (map.containsKey(remaining)) {
            ans[0] =i;
            ans[1] = map.get(remaining);
            break;

            
         }else{
            map.put(arr[i], i);
         }
      }
      return ans;
   }
    public static void main(String[] args) {
        int arr[] = {2,5,9,4,1};
        int ans[] = twosum(arr, 10);

        for(int ele:ans){
            System.out.println(ele);
        }
        
    }
    
}
