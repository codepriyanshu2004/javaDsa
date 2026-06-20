import java.util.HashMap;

public class basic1 {
    
    public static void main(String[] args) {
       
        // freq

        int arr[] = {1,2,3,1,2,3,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq+1);
                
            }else{
                map.put(arr[i], 1);
            }

        }

        for(int key:map.keySet()){
             System.out.println(map.get(key));

             
        }


    }
}
