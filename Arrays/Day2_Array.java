package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// class demoArray {

    // void arrayr(){

  // int[] age = new int[4];
  // age[0]=5;
  // age[1] =2;
  // age[2]=4;
  // age[3]=5;
  // System.out.println(age[0]);
  // System.out.println(age.length);

//   for(int i=0;i<4;i++){
//     System.out.print(age[i]);
//   }


//   int i=0;

//   while (i<4) {
//     System.out.println(age[i]);
//     i++;
    
//   }


// sum the array
    
//     int [] arr ={1,2,3,4,5};

//    int sum=0;

//    for(int i=0;i<arr.length;i++){
//     sum+=arr[i];
//    }
//    System.out.println(sum);


// max value

// int max =Integer.MIN_Value;
// int  min = Integer.MAX_VALUE;

// int [] arr= {1,2,3,4,5};

// for(int i=0;i<arr.length;i++){
//   if (arr[i]>max) {
//     max =arr[i];
    
//   }if(arr[i]<min){
//     min = arr[i];
//   }
// }

// System.out.println(max);
// s





// }
//  }

  // class arrat{
    //  static void search(){
    //     int [] arr ={1,4,2,6};
    //     int x=4;
    //     int ans =-1;

    //     for(int i=0;i<arr.length;i++){
    //         if (x==arr[i]) {
    //           ans = i;
    //         }
    //     }
    //    System.out.println(ans);
      
    //  int sum1 (int [] arr){
    //   int sum=0;
    
    //   for(int i=0;i<arr.length;i++){
    //     sum+=arr[i];
    //   }
    //   return sum;
    
    
    // }

    // }


   
public class Day2_Array {

 static int occurence (int [] arr,int x){
  
    int count =0;

    for(int i=0;i<arr.length;i++){
      if (x==arr[i]) {
        count++;
        
      }

      


    }
    return count;
  }

  static int lastoccurence(int [] arr,int x){
    int ans=0;

    for(int i=0;i<arr.length;i++){
      if (arr[i]==x) {
        ans=i;
        
      }
    }
    return ans;

  }


  static boolean sorting(int []arr){
    boolean check =true;

    for(int i=1;i<arr.length;i++){
      if (arr[i]<arr[i-1]) {
        check =false;
        break;
        
      }
    }

    return check;

   
  }

  static int[] smallandlargest(int[] arr){
    Arrays.sort(arr);

    int[] ans = {arr[0], arr[arr.length-1]};
     return ans;

  }

 
public static void main(String[] args) {
    // demoArray ob = new demoArray();
    // ob.arrayr();
  // arrat obj =new arrat();
//   obj.search();
// Scanner sc =new Scanner(System.in);
// System.out.println("enter the size");
// int n =sc.nextInt();

// int[] arr = new int[n];

// System.out.print("Enter the element");
// for(int i=0;i<arr.length;i++){
//     arr[i] =sc.nextInt();
// }



//  int c =obj.sum1(arr);
//  System.out.println(c);

// System.out.println(occurence(arr, 5));

// System.out.println(lastoccurence(arr, 2));

// System.out.println(sorting(arr));

// int [] ans = smallandlargest(arr);
// System.out.println( "small"+ans[0]);
// System.out.println("large"+ans[1]);


// int[] age = new int[5];
//   age[0]=1;
//   age[1] =2;
//   age[2]=3;
//   age[3]=4;
//   age[4]=5;
//   System.out.println(age[0]);
//   System.out.println(age.length);


//  int [] arr= {1,2,3,4,5};

 
// int max =Integer.MIN_VALUE;
// int  min = Integer.MAX_VALUE;

// int [] arr= {1,2,3,4,5};

// for(int i=0;i<arr.length;i++){
//   if (arr[i]>max) {
//     max =arr[i];
    
//   }if(arr[i]<min){
//     min = arr[i];
//   }
// }

// System.out.println(max);
// System.out.println(min);


  

}

}

    

