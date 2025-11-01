package String;

import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        
        // StringBuilder sb = new StringBuilder("abc");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());  capacity start from 16 so 3 will we add become 19

        // StringBuilder sb = new StringBuilder("");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        
        // StringBuilder sb = new StringBuilder(10);  // capcity declare ab 16 by default nhi rahega 10 ho jayeg
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());


       
        // StringBuilder sb = new StringBuilder("raghav");
        
        // StringBuilder str = new StringBuilder("madhav");
        // System.out.println(sb.compareTo(str));
      
        // taking input and changing the single chracter
        // Scanner  sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // StringBuilder sb = new StringBuilder(s);
        // System.out.println(sb);
        // sb.setCharAt(1,'a');
        // System.out.println(sb);
        

       




        
    //     String s = sc.nextLine();
    //       StringBuilder sb = new StringBuilder(s);
        
    //     for(int i =0;i<sb.length();i++){
    //         char ch = sb.charAt(i);
    //         int asic = (char) ch;

    //         if (asic>=65 && asic<=90) {
    //             asic+=32;
    //             char c = (char) asic;
    //             sb.setCharAt(i, c);
                
    //         }else if (asic>=97 && asic<=122) {
    //             asic -=32;
    //             char c = (char) asic;
    //             sb.setCharAt(i, c);
                
    //         }
    //     }
        
    //    System.out.println(sb);


    //append

//     StringBuilder s = new StringBuilder("Abc");
//     System.out.println(s);
   
//     s.append(35); // + use in string and Stringbuilder have append
//     s.append('W');
//     s.append("xyz");
//     System.out.println(s);
//     char[] ch = {'r','a','g'};
//     s.append(ch);
//     System.out.println(ch);
//    StringBuilder sb = new StringBuilder("pqr");
//    s.append(sb);
//    System.out.println(s);
    
   
//  StringBuilder sb = new StringBuilder("Abcwyz");

//  System.out.println(sb);
//  sb.deleteCharAt(1);
//  System.out.println(sb);
//  sb.delete(1, 3);
//  System.out.println(sb);
//  sb.append("ABC");
//  System.out.println(sb);
//  sb.insert(2,"PP"); 
//  System.out.println(sb);
 


// reverse  the string in builder there was reverse() is there inbuild

String s = sc.nextLine();


// StringBuilder sb = new StringBuilder(s);

// // sb.reserve();   reverse() is there inbuild function
// System.out.println(sb);

// int i =0; int j = sb.length()-1;

// while (i<j) {                                                                                                                                
//    char temp = sb.charAt(i);
//    sb.setCharAt(i, sb.charAt(j)); 
//    sb.setCharAt(j, temp);
//    i++;
//    j--;
    
// }
 
// System.out.println(sb);


//    StringBuilder sb = new StringBuilder(sc.nextLine());
//    int n =sb.length();
//    int i=0,j=0;

//    while (j<n) {
//     if (sb.charAt(j)!=' ') {
//         j++;
        
//     }else{
//         reverse(sb, i, j-1);
//         i=j+1;
//         j=i;
//     }
    
//    }

//     reverse(sb, i, j-1);
//    System.out.println(sb);

//     }


    // public static void reverse(StringBuilder sb,int i,int j){
    //     while (i<=j) {
    //         char temp = sb.charAt(i);
    //         sb.setCharAt(i, sb.charAt(j));
    //         sb.setCharAt(j,  temp);
    //         i++;
    //         j--;
            
    //     }

  
//  int n = sc.nextInt();
    
  
//     for(int k =0;k<n;k++){
         
//        String s = sc.next();

//        String str = s.substring(0,s.length()-2)+"i";
//        System.out.println();
//     System.out.println(str);

      
      
//     }
   
    }




    

    
   
     


   
}




