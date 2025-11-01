package String;

import java.util.Arrays;

public class StringDay3 {
    
    public static void main(String[] args) {
        
        // sorting character
        // or means lexograpical sorting like a dictonary book who apper first and last//

        // char[] ch  = {'d','c','z','b','a'};

        // for(int i =0;i<ch.length;i++){
        //     System.out.print(ch[i]+" ");
        // }
        // System.out.println();

        // Arrays.sort(ch);

        //   for(int i =0;i<ch.length;i++){
        //     System.out.print(ch[i]+" ");
        // }
        // System.out.println();
        

        // sorting string but string doesnt have inbuild function also string is immutible
        //  so first we covert string to characterArray thn sort it

        // String s= "bdeac";
        // char [] ch =s.toCharArray();
        
        // Arrays.sort(ch);
        //    for(int i =0;i<ch.length;i++){
        //     System.out.print(ch[i]+" ");
        //     s+=ch[i];
        // }
        // System.out.println();
        // System.out.println(s);
       
        // String ss = new String(ch);
        // System.out.println(ss);
     
       // sorting string builder

    //    StringBuilder sb = new StringBuilder("abcA");
    //    System.out.println(sb);
    //    String s = sb.toString();
    //    char ch [] = s.toCharArray();
    //    Arrays.sort(ch);

    //    System.out.println(ch);
    //   String ss = new String(ch);
    //   System.out.println(ss);


//   String s= "abcaacc";
//   int arr [ ] = new int[5];

//   for(int i =0;i<s.length();i++){
//     char ch = s.charAt(i);
//     int asic = (int) ch;
//     arr[asic-97] +=1;
//   }

//   int max = 0;
 
// for(int i =0;i<arr.length;i++){
//     max = Math.max(arr[i],max);
//      if (arr[i]==max) {
//         char ch = (char) (i+97);
//         System.out.println(ch);
        
//     }
    
// }

// for(int i =0;i<arr.length;i++){
//     if (arr[i]==max) {
//         char ch = (char) (i+97);
//         System.out.println(ch);
        
//     }
// }



// String []s = {"445","8975","107896"};
//   int max = Integer.MIN_VALUE;

//   for(int i =0;i<s.length;i++){
//     int n = Integer.parseInt(s[i]);
//     max=Math.max(max, n);

//   }

  // String ss =Integer.toString(max);
  // System.out.println(ss);

String s = "aaaagggeeeccuuu";
int i=0,j=0;
String ans ="";
while (j<s.length()) {

    if (s.charAt(i)==s.charAt(j)) {
        j++;
        
    }else{
        ans = ans+s.charAt(i);
        int len = j-i;
        if (len>1) {
            ans+=len;
            i=j;
            
        }

    }

    
}

 ans = ans+s.charAt(i);
        int len = j-i;
        if (len>1){
            ans+=len;
            i=j;
            
        }
System.out.println(ans);

       
    }
}
