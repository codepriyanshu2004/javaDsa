import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
   
  
// String s = sc.nextLine();


// int [] arr =  {2,4,10,10,10,18,20};
 
// int st = 0; int end = arr.length-1;
// int fI=0; 
// int target = 10;
// while (st<=end) {
//     int mid = (st+end)/2;
   
//     if (target==arr[mid]) {
//         fI = mid;
     
//         end = mid-1;
      

//     }else if (arr[mid]>target) {
//         end = mid-1;
//     }
//     else{
//         st = mid+1;
//     }


        
//     }

//     int lI=0;
// int st1 = 0; int end2 = arr.length-1;
//     while (st1<=end2) {
//         int mid = (st1+end2)/2;
   
//     if (target==arr[mid]) {
//         lI = mid;
//         st1 = mid+1;
      
//     }else if (arr[mid]>target) {
//         end2 = mid-1;
//     }
//     else{
//         st1 = mid+1;
//     }
//     }

//     System.out.println(lI-fI+1);
  

StringBuilder sb = new StringBuilder("i am priyanshu");
 int i =0;int j=0;

 while (j<sb.length()) {

    if (sb.charAt(j)!= ' ') {
        j++;
    }else{
  char temp = sb.charAt(i);
    sb.setCharAt(i, sb.charAt(j));
    sb.setCharAt(j, temp);
    i=j+1;
    j=i;
    }
    
    
 }
 char temp = sb.charAt(i);
    sb.setCharAt(i, sb.charAt(j));
    sb.setCharAt(j, temp);
    i++;
    j--;

 System.out.println(sb);

}




    }

