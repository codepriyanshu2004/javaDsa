package Basic;
import java.util.ArrayList;

public class temp {
    

    static int sum (ArrayList<Integer>l){
        int sum=0;

        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }

        return sum;
        

    }

    static int [] merge(int []arr,int m,int brr[],int n){
           
        // int                                          12300
                                                //    256
          int i=m-1;
          int j =n-1;
          int k = m+n-1;

          while (i>=0 && j>=0) {

            if (arr[i]>brr[j]) {
                arr[k--] = arr[i--];
                
            }else{
                arr[k--] = brr[j--];
            }
          }

          if (j>=0) {
            arr[k--] = brr[j--];
            
          }

          return arr;

         
          }
         

          
    
   
    public static void main(String[] args){
       

    //    ArrayList<Integer>l= new ArrayList<>();
    //    l.add(1);l.add(2);l.add(3);l.add(4);


    //    int a= sum(l);
    //   System.out.println(a);
   
      int []arr = {1,2,3,0,0,0};
      int [] brr = {2,4,5};
   int [] lrr =    merge(arr, 3, brr, 3); 
   for(int i =0;i<lrr.length;i++){
    System.out.println(lrr[i]);
   }
     
//    int ans=1;
//    for(int i=1;i<=5;i++){
//     ans *= 2;
//    }
//    System.out.println(ans);
}
}