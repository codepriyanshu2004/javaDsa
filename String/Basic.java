package String;

import java.util.Scanner;

public class Basic {
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        // All about character


        // char ch = 'A';
        // System.out.println(ch);

        // System.out.println("Enter the character");
        // char ch =  sc.next().charAt(0);
        // System.out.println(ch);

        // Character Array

        // char [] ch = {'h','e','l','l','o'};
        // for(int i =0;i<ch.length;i++){
        //     System.out.print(ch[i]);
        // }
           

        // char [] ch = new char[5];
        // for(int i =0;i<ch.length;i++){
        //     ch[i] = sc.next().charAt(0);
        // }
        // for(int i =0;i<ch.length;i++){
        //     System.out.print(ch[i]);
        // }

        // String

        // String s = "priyanshu singh is is developer";
        // System.out.println(s);

        // Input

    //    System.out.print("Enter ur name: ");
      
        // String s = sc.next();              // for single word input sc.nextLine() for sequence for string
        // sc.nextLine()   it consume the leftover space
        // System.out.println(s);

    

    //   String s = "Priyanshu singh";
    //   System.out.println(s.charAt(3));
    //   System.out.println(s.length());

    // String s = "Priyanshu singh";
    
    // int count = 0;
    // for(int i =0;i<s.length();i++){
    //       char ch = s.charAt(i);
    //       if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ) {
    //         count++;
    //       }
    // }

    // System.out.println(count);

    // System.out.println(s.indexOf('i'));
    // System.out.println(s.lastIndexOf('i'));

//    String a= "abc";
//    String b = "dbc";
//    System.out.println(a.compareTo(b));  // -3

//     String a= "abc";
//    String b = "abc";
//    System.out.println(a.compareTo(b)); // 0
   
    
//  String a= "afc";
//    String b = "abc";
//    System.out.println(a.compareTo(b));   //4
  

//  String a= "abcgggg";
//    String b = "abc";
//    System.out.println(a.compareTo(b)); //4

//     String a= "bbcgggg";
//    String b = "abc";
//    System.out.println(a.compareTo(b)); //1



//   String c ="physics wallah skills";
//   String cc = "Priyanshu singh";
//   System.out.println(c.contains("allah")); //true
//   System.out.println(c.contains("pallah"));  //false
//   System.out.println(c.startsWith("phy")); //true
//    System.out.println(c.startsWith("wallah")); // false
//    System.out.println(c.endsWith("lls"));  //true
//       System.out.println(c.endsWith("sics")); //false

//       System.out.println(cc.toLowerCase());
//       System.out.println(c.toUpperCase());
//       System.out.println(c+cc); 
//       System.out.println(c.concat(cc));

//       String s = "abcde";
//       System.out.println(s.substring(1)); //bcde
//       System.out.println(s.substring(1,4)); //bcd
//       System.out.println(s.substring(2,2));
//       System.out.println(s.substring(0, 5));  //abcde

//    String s = "abcd";

//    for(int i =0;i<s.length();i++){
//     for(int j =i;j<=s.length();j++){
//         System.out.print(s.substring(i, j)+" ");
//     }
//     System.out.println();
//    }


// + opreator

// String s = "abc";
// String t = "qps";
// s = s.concat(t)   here we can add only string not number but useing + we can also add  and character
// s = s+t;
// s = s+'z';
// s = 10+s;
// System.out.println(s);
// System.out.println("hii i am"+10);



// take a integer input and conver into  string;

// int n = sc.nextInt();
// String s = "";

// s= s+n;

// total number of digits without loop

// int n = sc.nextInt();
// String s = ""+n;
// s= Integer.toString(n)   // second inbulid way 
// System.out.println(s.length());


// string is immutability we cannot change the string character 
// but there was one way but very time and meremory consuming create problem

// conver hello to heylo

// String s= "hello";   //heylo
// s = s.substring(0,2)+'y'+s.substring(3);
// System.out.println(s);


// input a string and update all the even positions in the
// string to character  'a'.consider 0-based indexing
 String t = sc.nextLine();
String s = "";

for(int i =0;i<t.length();i++){
    if (i%2==0) {
        s+='a';

        
    }else{
        s+= t.charAt(i);
    }
 }
   System.out.println(s);
   t=s;
   System.out.println(t);



// == it was use in number for string compare opetor is equals
// String s = "abc";
// String t = "abc";
// System.out.println(s.equals(t));






    }

}
