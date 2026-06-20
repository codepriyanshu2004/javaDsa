package Hashset;

import java.util.HashSet;

public class basic3 {

    static int rev (int n){

        int ans=0;
        while (n!=0) {
             ans = ans*10 + n%10;
             n/=10;
        }

        return ans;
    }
    
    public static void main(String[] args) {

        // Input: nums = [1,13,10,12,31]
        //    Output: 6

         int arr []= {1,13,10,12,31};

         HashSet<Integer> set = new HashSet<>();

         for(int i=0;i<arr.length;i++){
             
            set.add(arr[i]);
            set.add(rev(arr[i]));
         }

         System.out.println(set.size());


        
    }
}
