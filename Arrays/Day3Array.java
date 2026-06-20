package Arrays;
public class Day3Array {

    
    
    
    
    // Two pointer pattern

    //Sort 0 first then 1

    static void zeroOne(int[] arr){
        int n=arr.length;
        int zero=0;

        for(int i=0;i<n;i++){
            if (arr[i]==0) {
                zero++;
                
            }
        }

        for(int i=0;i<n;i++){
            if (i<zero) {
                arr[i] =0;
                
            }else{
                arr[i]=1;
            }
        }
    
    }   

    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    static void TwoPonter(int [] arr){
        int n= arr.length;
        int left=0;
        int right=n-1;

        while (left<right) {
            if (arr[left]==1 && arr[right]==0) {
                swap(arr, left, right);
                left++;
                right--;
                
            }else if (arr[left]==0){
                left++;

            }else if (arr[right]==1){
                right--;
            }
                
            }
                
            }
            

            static void EverOdd(int [] arr){
                int n= arr.length;
                int l=0;
                int right =n-1;

                while (l<right){
                    if (arr[l]%2==1 && arr[right]%2==0){
                        swap(arr,l,right);
                        l++;
                        right--;
                    }else if (arr[l]%2==0){
                        l++;
                    }else if (arr[right]%2==1){
                        right--;
                    }
                        
                    }
                        
                    }


                    static int [] sqaure(int []arr){
                        int n =arr.length;
                        int l=0;
                        int r=arr.length-1;

                        int [] ans =new int[n];
                        int k=0;


                        while (l<=r){
                            if (Math.abs(arr[l])>Math.abs(arr[r])){
                                ans[k++]=arr[l]*arr[l];
                                l++;

                            }else{
                                ans[k++] =arr[r] * arr[r];
                                r--;
                            }
                            }
                            return ans;

                            }

                        static int [] sqaure1(int []arr){

                        int n =arr.length;
                        int l=0;
                        int r=arr.length-1;

                        int [] ans =new int[n];
                        int k=r;


                        while (l<=r){
                            if (Math.abs(arr[r])>Math.abs(arr[l])){
                                ans[k--]=arr[r]*arr[r];
                                r--;

                            }else{
                                ans[k--] =arr[l] * arr[l];
                                l++;
                            }
                            }
                            return ans;

                            }

                        
                                //010230
                       static void zeroAndnonZero(int [] arr){
                          int st =0;int end = arr.length-1;

                          while (st<=end) {
                            
                            if (arr[st]!=0  && arr[end]==0  ) {
                                 
                                int temp =arr[st];
                                arr[st] = arr[end];
                                arr[end] = temp;
                                st++;
                                end--;
                                
                            }else if(arr[st]==0){
                                st++;
                            }else if(arr[end]!=0){
                               end--;
                            }

                          }
                       }     
                    
                    
                    static void demo(int [] arr){

                        for(int i=0;i<arr.length;i++){
                            for(int j=0;j<arr.length-1;j++){
                                if (arr[j]>arr[j+1]) {
                                    int temp = arr[j];
                                    arr[j] = arr[j+1];
                                    arr[j+1] = temp;
                                    
                                }
                            }
                        }
                    }    
                    
                
                    
                
            
        
        
    
    public static void main(String[] args) {
        // int[] arr ={0,1,1,0,1};
    // zeroOne(arr);

    // TwoPonter(arr);

    // int [] arr ={2,3,5,4};
    // EverOdd(arr);
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]);
    // }
      
    int [] arr ={-10,-3,-2,1,4,5};
    // //  int [] ans = sqaure(arr);
    int [] ans = sqaure1(arr);

     for(int i=0;i<ans.length;i++){
         System.out.print(ans[i]+ " ");
     }

//   int [] arr = {1,0,2,3,0};

    // zeroAndnonZero(arr);
    // demo(arr);
   
    // for(int i = 0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }


    

}}
