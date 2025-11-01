import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day6Sorting {

    static void bubblesort(int [] arr){
        int n=arr.length;
        boolean flag =false;

        for(int i =0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=true;
                    
                }
            }

            if (flag==false) {
                return;
                
            }
        }
    }


    static void selectionSort(int [] arr){
        int n = arr.length;
       
        for(int i =0;i<n-1;i++){
          int  min_index = i;

            for(int j =i+1;j<n;j++){
                if (arr[j]<arr[min_index]) {
                   min_index=j;
                    
                }
            }
            int temp=arr[i];
            arr[i] = arr[min_index];
            arr[min_index]=temp;
        }
    }
   
    static  void selection(int [] arr){
        for(int i =arr.length-1;i>=0;i--){
            int max_index = i;
            for(int j = i-1;j>=0;j--){
                if (arr[j]>arr[max_index]) {
                    max_index = j;
                    
                }
            }
            int temp=arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
    }
    static void InsertionSort(int [] arr){
        int n = arr.length;

        for(int i=1;i<n;i++){
            int j=i;

            while (j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
                
            }
        }
    }


    static void Zeroand1(int [] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                arr[j++] =arr[i];
                
                
            }
        }

        while (j<arr.length) {
            arr[j++]=0;
            
        }
      
    }

   
    static void zeroone(int [] arr){

        int n = arr.length-1;
    boolean flag =false;
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i;j++){
                if (arr[j]==0 && arr[j+1]!=0) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                    
                    
                }
            }
            if (!flag) {
                return;
                
            }
        }

    }

    static void lexicograpical(String [] arr){
        for(int i=0;i<arr.length;i++){
            int min_index =i;

            for(int j=i+1;j<arr.length;j++){
                if (arr[j].compareTo(arr[min_index])<0) {
                    min_index =j;
                    
                }
            }

            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }

    static int [] mergesortedArray(int [] arr,int [] brr){
        int ans [] = new int[arr.length+brr.length];
         int  k=0;
          int i=0;
          int j=0;

          while (i<arr.length && j<brr.length) {

            if (arr[i]<=brr[j]) {
                ans[k++]=arr[i];
                i++;
                
            }else {
                ans[k++]=brr[j];
                j++;
                
            }
            
          }

          if (i==arr.length) {
            while (j<brr.length) {
                ans[k++]=brr[j++];
                
            }
            
            
          }

            if (j==brr.length) {
            while (i<arr.length) {
                ans[k++]=arr[i++];
                
            }
            
            
          }
          return ans;
    }

   

     

    static int [] NextGreatest(int [] arr){
         
        int [] ans = new int [arr.length];
        ans[arr.length-1] =-1;
        for(int i =0;i<arr.length-1;i++){
            int maxx= Integer.MIN_VALUE;

            for(int j=i+1;j<arr.length;j++){
                maxx = Math.max(maxx, arr[j]);
            }

            ans[i] = maxx;

        }
        return ans;

    }

    static int [] nextGreater(int [] arr ){
          int n = arr.length;

        int [] ans = new int [n];
        ans [n-1] = -1;

        int nge = arr[n-1];
      

        for(int i=n-2;i>=0;i--){
            ans[i] = nge;
       
             nge = Math.max(nge,arr[i]);


        }

        return ans;

    }


    static void ss(int [] arr){
        for(int i =0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length;i++){
                if (arr[j]<arr[min]) {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // int [] arr ={2,0,2,1,1,0};
        // int n = arr.length;

      

        // for(int i=0;i<n;i++){
        //     for(int j =0;j<n-1;j++){
        //         if (arr[j]>arr[j+1]) {
        //             int temp =arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
                    
        //         }
        //     }
        // }



        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]);
        // }


       
        // List<Integer> arrayList = new ArrayList<>();

        // for(int i=0;i<arr.length;i++){
        //     arrayList.add(arr[i]);
        // }

        // Collections.sort(arrayList);

        // System.out.println(arrayList);

        // bubblesort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

        // selectionSort(arr);
        // selection(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

        // InsertionSort(arr);


// 
  int [] arr = {0,5,0,3,4,2};
   
        // Zeroand1(arr);
        zeroone(arr);


        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]);
        }

    //     String arr [] ={"kiwi","apple","papaya","mango"};
    //     lexicograpical(arr);
    //    for(String st:arr){
    //     System.out.print(st+" ");
    //    }

//     int []arr ={11,33,42,71};
//     int [] brr = {26,54,69,81,99};

//   int [] ans = mergesortedArray(arr, brr);





// for(int el:ans){
//     System.out.print(el);
// }
//     }}
//        int [] arr2 ={12,8,41,37,2,49,16,28,21};
// int [] arr1 = NextGreatest(arr2);

    
// for(int i=0;i<arr1.length;i++){
//     System.out.print(arr1[i]);
// }

//    int[] [] arr1 = {
//                {1,2},
//                {2,3}
//    };

//    int [] [] brr ={
//           {1,4},
//           {3,2}
//    };

//   int [][] prr = sumsum(arr1, brr);

//   for(int i=0;i<prr.length;i++){
//     for(int j=0;j<prr[i].length;j++){
//           System.out.print(prr[i][j]+" ");
//     }
//     System.out.println();
//   }
  
    // int [] arr = {12,8,41,37,2,49,16,28,21};
//    int [] ans = nextGreater(arr);
             

//    for(int i = 0;i<ans.length;i++){
//     System.out.print(ans[i]);
//    }

    
}}

