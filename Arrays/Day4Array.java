package Arrays;
import java.util.Scanner;



// prefix suffix questions

public class Day4Array {

    static void prefix(int [] arr){
        for(int i=1;i<=arr.length-1;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }

    static int  Querysum(int[] arr,int l,int r){
        int ans=0;
        for(int i=l;i<=r;i++){
          ans +=arr[i];
        }
       

        return ans;
        
    }


    static int sum(int []arr){
        int sum= 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static boolean Equalpartition(int[] arr){     
        int Total=sum(arr);

        int prefix=0;
        int suffix=0;
        for(int i=0;i<arr.length;i++){
            prefix +=arr[i];
            suffix =Total-prefix;
            if (suffix==prefix) {
                return true;
                
            }

        }
        return false;
    }

    static void suffix(int [] arr){
        int n=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
    }
    public static void main(String[] args) {
        // int [] a={2,1,3,4};

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size");
    //     int n =sc.nextInt();
    //     int [] arr = new int[n];
    //     System.out.println("Enter the element");
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }


    //     int sum = Querysum(a, 0, 2);
    // System.out.println("Sum from index 0 to 2 is: " + sum);


    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }

    // int a1 [] = {2,2,3,3};
    int a2 [] = {2,2,2,2};
    System.out.println(Equalpartition(a2));

       
    // suffix(a);
        

    // // prefix(a);
    // for(int i=0;i<a.length;i++){
    //     System.out.print(a[i]+" ");
    // }

    }}

       
    
  
