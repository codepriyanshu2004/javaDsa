package Arrays;
public class Day2Array {

    
    
   
   
    // Target sum pattern

    static int pair(int [] arr,int x){
        int count =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x) {
                    count++;
                    
                }

            }
        }
        return count;
    }

    static int triblepair(int [] arr ,int x){
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==x) {
                        count++;
                        
                    }
                }
            }
        }
        return count;
    }



    // pair in Array and count
       
   
    static void pairinArray(int [] arr){
        int total =0;
        for(int i=0;i<arr.length;i++){
            int current = arr[i];

            for(int j= i+1;j<arr.length;j++){
                System.out.print("("+current+arr[j]+")"+",");
                total++;
            }
            System.out.println(" ");

        }

        System.out.println("Total pair"+total);
    }


    // print subArray ,subArray are continous

    static void subArray(int [] arr){
        int total = 0;

        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;

                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    total++;
                }
                System.out.println();

            }
            System.out.println();
          
        }
          System.out.println(total);
    }

       

    // max subArray sum
    
      static void subArrayMax(int [] arr){
        int max =Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                int currentSum =0;
                
                for(int k=start;k<=end;k++){
                    currentSum +=arr[k];

                }
                System.out.println(currentSum);

                if (currentSum>max){
                    max = currentSum;
                }
                    
                }
                System.out.println(" ");
            }
            System.out.println("Maximum sum is "+max);
        }
      
        // kadane algo for subArrayMax in O(n)
        
     static void kadanealorigtm(int [] arr){
        int currentsum =0;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            currentsum+=arr[i];
         
            max = Math.max(currentsum,max);

               if (currentsum<0){
                currentsum =0;
                
            }
        }
        System.out.println(max);
     }

     

     static int BuySellstock(int [] arr){


        int buyPrice = Integer.MAX_VALUE;
        int max =0;

        for(int i=0;i<arr.length;i++){

            if (buyPrice<arr[i]) {
                int profit = arr[i] - buyPrice;
                max = Math.max(profit,max);
                
            }else{
                buyPrice = arr[i];
            }
        }

        return max;
     }


    



    // Array manipulation

    static int uniqueElement(int[] arr){
        int ans=-1;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    arr[i]=0;
                    arr[j]=0;
                    
                }
            }
           
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0) {
                ans=arr[i];
                
            }
            // System.out.println(arr[i]);
        }
      
        return ans;
    }


    static int max(int []arr){
        int ans =0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans) {
                ans =arr[i];
                
            }
        }
        return ans;
    }

    static int secondmax(int []arr){
        int max =max(arr);

        for(int i=0;i<arr.length;i++){
            if (arr[i]==max) {
                arr[i] = Integer.MIN_VALUE;
                
            }

        }
        int secondMax = max(arr);
        return secondMax;
        
    }

    static int firstRepeat(int [] arr){
        int n =arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){

             
                return arr[i];
                
                }

            }
        }
        return -1;
    }

  static void swap(int a,int b){
    
    int temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
  }

  static void swapWithOuttEmp(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a);
    System.out.println(b);
  }


  static void PrintArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }

  }

  static int [] reserveArray(int[]arr){
    int n =arr.length;
    int [] arr1 =new int[n];
    int j=0;

    for(int i=arr.length-1;i>=0;i--){
        arr1[j++] =arr[i];
    }
    PrintArray(arr1);
   return arr1;

  }

//   reserve array INPLACE means reserve it in same Array no another space

   

 static void swap(int [] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
 }




static void reserveInpace(int [] arr){
    int i=0;
    int j=arr.length-1;

    while (i<j) {
        swap(arr,i, j);
        i++;
        j--;
        
    }

    PrintArray(arr);
}

static  void swap1(int [] arr,int i,int j){
    int temp =arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

}

static void reserve(int [] arr ,int st,int end){
   
    while (st<end) {
        swap1(arr, st, end);
        st++;
        end--;
        
    }
}

static void rotate(int [] arr,int k){
    int n =arr.length;
    k=k%n;

  
    reserve(arr, 0, n-k-1);
    reserve(arr, n-k, n-1);
    reserve(arr, 0, n-1);

}


static void search(int [] arr,int x){
    boolean b = false;

    for(int i=0;i<arr.length;i++){
        if (arr[i]==x) {
            b=true;
            break;
            
        }
    }

    if (b) {
        System.out.println("present");
        
    }else{
        System.out.println("Not present");
    }
}


    public static void main(String[] args) {
    //     int [] arr = {4,6,3,5,8,2};
    //   System.out.println(pair(arr, 7)); 
    //   int [] arr1 ={1,4,5,6,3} ;
    //   System.out.println(triblepair(arr1, 12));
    // int []arr2={1,3,1,3,5,6,5};
    // System.out.println(uniqueElement(arr2));

    int [] arr3 ={3,5,7,9};
    // System.out.println(max(arr3));
    // System.out.println(secondmax(arr3));

    // int [] arr4={1,2,3,2,3};
    // System.out.println(firstRepeat(arr4));

    // swap(2, 9);

    // swapWithOuttEmp(2,5);
      
//  reserveArray(arr4);

// reserveInpace(arr4);

int [] arr5 ={1,2,3,4,5};
// for(int i=0;i<arr5.length;i++){
//     System.out.print(a);
// }

rotate(arr5, 2);
PrintArray(arr5);

//    pairinArray(arr5);
//    subArray(arr5);

//    subArrayMax(arr5);

//    int [] arr = {-2,-3,4,-1,-2,1,5,-3};

//   subArrayMax(arr);
//   kadanealorigtm(arr);
 
// int [] arr = {7,1,5,3,6,4};
//   int buysell = BuySellstock(arr);
//   System.out.print(buysell);


// search(arr5, 5);

    

      
        
    }
    
}
