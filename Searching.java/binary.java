public class binary {
     



    static int binarySearch(int []arr,int target){       
      int st =0;
      int end = arr.length-1;
         
        while (st<end) {
            int mid = (st+end)/2;
            if (arr[mid]==target) {
                System.out.println("target found");
                return mid;
                
            }else if (arr[mid]<target) {
                st = mid+1;

                
            }else if (arr[mid]>target) {
                end = mid-1;
            }
        }

        return -1;
    }

     static int firstOccurence(int [] arr,int target){
              
        
       
        int st =0; int end = arr.length-1;
        int ans =-1;
        while (st<=end) {
            int mid = (st+end)/2;
            
            if (target==arr[mid]) {
                ans = mid;
                end= end-1;
            }else if (target>arr[mid]) {
                st = mid+1;
                
            }else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return ans;

    }

    
    static int lastOccuernce(int [] arr,int target){
        int st = 0;int end = arr.length-1;
        int ans = -1;

        while (st<=end) {
            int mid = st+(end-st)/2;

            if (target==arr[mid]) {
                ans = mid;
                st = mid+1;
                
            }else if(target>arr[mid]){
                st=mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }
            
        }
        return ans;
    }



     
     static int DescesdingBinarySearch(int [] arr,int target){
        int st =0; int end= arr.length-1;

        while (st<end) {
            int mid = (st+end)/2;

            if (arr[mid]==target) {
                System.out.println("target found");
                return mid;

            }else if (arr[mid]>target) {
                st = mid+1;
                
            }else if (arr[mid]<target) {
                end = mid-1;
            }
        }

        return -1;
     }


      static int orderNotKnow(int [] arr,int target){
        int l =0;int r = arr.length-1;
        
        if(arr.length==1 && arr[0]==target){
            return 0;
            
        }
        else if(arr[0]>arr[1]){
            while(l<=r){
                int mid = (l+r)/2;
                if(target==arr[mid]){
                    return mid;
                }else if(target>arr[mid]){
                    r= mid-1;
                }else if(target<arr[mid]){
                    l= mid+1;
                }
            }
        }else{
            
             while(l<=r){
                int mid = (l+r)/2;
                if(target==arr[mid]){
                    return mid;
                }else if(target>arr[mid]){
                    l = mid+1;
                }else if(target<arr[mid]){
                    r= mid-1;
                }
            }
        }
        
        return -1;
    }


  static void lowerBound(int [] arr,int target){

       int st =0;
       int end = arr.length-1;

       int lb = arr.length;

         while (st<=end) {
            int mid = st +(end-st)/2;
            if (arr[mid]>=target) {
                lb = Math.min(mid,lb);
                end = mid-1;
                
            }else{
                st=mid+1;
            }
            
         }
         System.out.println(lb);
         
  }


  static void upperBound(int [] arr,int target){
     int st =0;int end = arr.length-1;
     int ub = arr.length;

       while (st<=end) {
         int mid = st+(end-st)/2;
         if (arr[mid]>target) {
            ub = mid;
            end = mid-1;
            
         }else{
            st=st+1;
         }
        
       }
       System.out.println(ub);
  }



    static int [] firstAndlastOcurrenece(int [] arr,int target){
        int []ans = {-1,-1};

        int st = 0;int end = arr.length-1;
         boolean flag = false;
        while (st<=end) {
            int mid = st+(end-st)/2;
            if (arr[mid]==target) {
                 flag=true;
                 break;
            }else if (arr[mid]>target) {
                  end = mid-1;
            }else if (arr[mid]<target) {
                st = mid+1;
            }
        }

        if ( flag==false) {
            return ans;
        }

         st = 0;end = arr.length-1;
        
         int lb =arr.length;
        while (st<=end) {
            int mid = st+(end-st)/2;
            if (arr[mid]>=target) {
                 lb = mid;
                 end = mid-1;
            }else{
                st = mid+1;
            }
        }

        ans[0] = lb;

          st = 0; end = arr.length-1;
       int ub = arr.length;
        while (st<=end) {
            int mid = st+(end-st)/2;
            if (arr[mid]>target) {
                ub = mid;
               end = mid-1;
            }else{
                st = mid+1;
            }
            
        }
        ans[1] = ub-1;


        return ans;

    }



    public static void main(String[] args) {
       
    //         int arr[] = {1,2,3,4,5,6,7,8,9};
    //    int target = 7;

    //   int ans =  binarySearch(arr, target);
    //   System.out.println(ans);



        
//         int []  arr = {9,8,7,6,5,4,3,2,1};

//            int target = 7;
    
   
//    int ans =  DescesdingBinarySearch(arr, target);
//       System.out.println(ans);
  

   


//    int [] arr = {1,2,3,4,5};
//    int [] arr = {5,4,3,2,1};
//    int taget =4;

//    int ans = orderNotKnow(arr, taget);  // for sorted ascending and decending both order it will work
//    System.out.println(ans);


// int [] arr = {2,4,10,10,10,18,20};
// int target = 10;
// int ans = firstOccurence(arr, target);
// System.out.println(ans);

// int ans = lastOccuernce(arr, target);
// System.out.println(ans);
   
//    int [][] arr = new int[5][];
//    for(int i =0;i<arr.length;i++){
//     arr[i] = new int[i+1];
//     arr[0][0]=1;
//     arr[i][i] =1;

//     for(int j =1;j<i;j++){
//           arr[i][j] = arr[i-1][j]+arr[i-1][j-1]
//     }

//    }



    int [] arr = {10,20,30,30,40,50,60,70};
    // int target = 30;
    // int target = 40;
    // int target = 25;
    //  lowerBound(arr,target );
    // upperBound(arr, target);
   
    // int target = 30;
    int target = 5;
    int [] ans = firstAndlastOcurrenece(arr, target);

    for(int i =0;i<ans.length;i++){
        System.out.println(ans[i]+" ");
    }
}
}