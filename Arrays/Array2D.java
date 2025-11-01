package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array2D {

    static void Print2DArray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }


    static void Add2Matrices(int [][] arr,int r1,int c1,int [][] brr,int r2,int c2){
         

        if (r1!=r2 || c1!=c2) {
            System.out.println("row or column doest match");
            return;
            
        }
        int [][] ans = new int [r1][c2];

        for (int i = 0; i < r1; i++) {
            for(int j=0;j<c2;j++){
                ans [i][j] = arr[i][j]+brr[i][j];
            }
            
        }
        Print2DArray(ans);
    }


    static void multiply2Marices(int[][] arr,int r1,int c1,int [][] brr,int r2,int c2){
        
        if (arr[0].length !=brr.length) {
            System.out.println("colum and row dont match");
            return;
            
        }else{
            int [][]  ans = new int[arr.length][brr[0].length];
            for(int i =0;i<ans.length;i++){
                for(int j =0;j<ans[0].length;j++){
                    for(int k=0;k<brr.length;k++){
                        ans[i][j] +=arr[i][k]*brr[k][j];
                    }
                }
            }
            Print2DArray(ans);
        }
    }

    static void tranpose(int[] [] arr,int r,int c){
        
        int [][] tranpose = new int [r][c];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                tranpose[i][j] = arr[j][i ];

        }
    }
    Print2DArray(tranpose);
}

static void InplaceTranpose(int [][]arr,int r,int c){

    int n = arr.length;
    
    for(int i =0;i<n;i++){
        for(int j =0;j<=i;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    Print2DArray(arr);
}

static void reserve(int [] arr){
    int l =0;
    int r=arr.length-1;

    while (l<r) {
        int temp =arr[l];
        arr[l]=arr[r];
        arr[r]= temp;
        l++;
        r--;

        
    }
}
static void Rotate90Degree(int [][]arr,int n){

         for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
         }

        
         
         for(int i=0;i<n;i++){
            // int a = 0,b=arr[0].length-1;
            // while (a<b) {
            //     int temp = arr[i][a];
            //     arr[i][a] = arr[b][i];
            //     arr[b][i] = temp;
            //     a++;
            //     b--;
                reserve(arr[i]);
            }
         

        Print2DArray(arr);
      
    }


    static void waveprint(){
        int [] []  arr = { {1,2,3} ,{4,5,6},{7,8,9} };
         
        int n = arr.length;
        int m = arr[0].length;

        for(int i =0;i<n;i++){

            if(i%2==0){
                for(int j =0;j<m;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println( " ");
                }else{
                    for(int j=m-1;j>=0;j--){
                        System.out.print(arr[i][j]);
                    }
                    System.out.println( " ");
                }

            }

        }

    


    static int[][] pascal(int n){

        int arr[][] = new int[n][];

        for(int i =0;i<n;i++){
            arr[i] = new int [i+1];     //column dynamic
            arr[i][0]=1;
            arr[i][i] = 1;

            for(int j =1;j<i;j++){
                arr[i][j] =  arr[i-1][j] +  arr[i-1][j-1];
            }
        }

        return arr;
    }

  

    static void spiral(int [][] matrix,int r,int c){
        
      
        
       }

       static int flipmatri(int arr [][]){
         
        int m = arr.length;
        int n = arr[0].length;

        for(int i =0;i<m;i++){
            if (arr[i][0]==0) {
                
                for(int j =0;j<n;j++){
                    if (arr[i][j]==0) {
                        arr[i][j]=1;
                    }else{
                         arr[i][j]=0;
                    }
                }
            }
        }

        for(int j=1;j<n;j++){
            int countzero=0;
            int countone=0;
            for(int i =0;i<m;i++){
                if(arr[i][j]==0){
                    countzero++;
                }else{
                    countone++;
                }

               
            }

             if (countzero>countone) {
                  for(int i =0;i<m;i++){
                    if (arr[i][j]==0) {
                         arr[i][j]=1;
                    }else{
                         arr[i][j]=0;
                    }
                }
            }

           
        }

         int score = 0; int x =1;

            for(int j =n-1;j>=0;j--){
                for(int i =0;i<m;i++){
                    score+= arr[i][j]*x;
                }x*=2;
            }

            return score;
       }
        
    

    public static void main(String[] args) {
        // int [] [] arr ={
        //        {1,2,3},
        //        {4,5,6},
        //        {7,8,9}
        // };
        // Print2DArray(arr);

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the row");
        // int r =sc.nextInt();
        // System.out.println("Enter the colum");
        // int c =sc.nextInt();
        // int [][]arr1 = new int[r][c];
     
        // System.out.println("Enter"+r*c+"elements");
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         arr1[i][j]=sc.nextInt();
        //     }
        // }
        // Print2DArray(arr1);

        // matrices

         System.out.println("Enter the first Array");
        System.out.println("Enter the row1");
        int r1 =sc.nextInt();
        System.out.println("Enter the colum1");
        int c1 =sc.nextInt();
        int [][]arr1 = new int[r1][c1];
     
        System.out.println("Enter"+r1*c1+"elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the second Array");
        System.out.println("Enter the row2");
        int r2 =sc.nextInt();
        System.out.println("Enter the colum2");
        int c2 =sc.nextInt();
        int [][]arr2 = new int[r2][c2];
     
        System.out.println("Enter"+r2*c2+"elements");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        Add2Matrices(arr1, r1, c1, arr2, r2, c2);

            // System.out.println("Matrix 1");;
            // System.out.println(arr1);
            // System.out.println("Matrix");
            // System.out.println(arr2);

        // multiply2Marices(arr1, r1, c1, arr2, r2, c2);

        
    //     int [] [] arr ={
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9}
    //  };
    //     tranpose(arr,3,3);
    // InplaceTranpose(arr, 3, 3);
    // Rotate90Degree(arr, 3);

    // int [][] ans = pascal(5);
    // Print2DArray(ans);
        
    //  spiral(arr1, r1, c1);
    //  Print2DArray(arr1);
    // waveprint();
 
    // int [][] arr =  {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
      
    // int n = arr.length;
    // int m = arr[0].length;
    // int minr=0;
    // int maxr=n-1;
    // int minc=0;
    // int maxc=m-1;

    // while (minr<=maxr && minc<=maxc) {
     
    //     //  left to rigth
    //     for(int j =minc;j<=maxc;j++){
    //         System.out.print(arr[minr][j]+" ");
    //     }
    //     minr++;
        
    //     if (minr>maxr || minc>maxc) break;
        
    //     // top to bottom
    //     for(int i =minr;i<=maxr;i++){
    //          System.out.print(arr[i][maxc]+" ");
    //     }
    //     maxc--;
  
    //       if (minr>maxr || minc>maxc) break;
          
    //     //   right to left
    //      for(int j =maxc;j>=minc;j--){
    //         System.out.print(arr[maxr][j]+" ");
    //     }
    //     maxr--;

    //       if (minr>maxr || minc>maxc) break;
       
    //     //   bottom to top
    //     for(int i =maxr;i>=minr;i--){
    //          System.out.print(arr[i][minc]+" ");
    //     }
    //     minc++;
        
    // }
      
    int [][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};

    System.out.println(flipmatri(arr));


    }
    
}
