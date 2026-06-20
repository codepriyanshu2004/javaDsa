package Hashset;

import java.util.HashSet;

public class basic4 {

    
         static String rev(String s){
        int i=0;int j = s.length()-1;
         StringBuilder sb = new  StringBuilder(s);

        //  while(i<j){
        //     char temp= sb.charAt(i);
        //      sb.setCharAt(i,sb.charAt(j));
        //      sb.setCharAt(j,temp);
        //      i++;
        //      j--;
        //  }
        sb.reverse();
         s=sb.toString();
         return s;
    }
    public static void main(String[] args) {

       String [] words= {"cd","ac","dc","ca","zz"};

   
        

        HashSet<String>set = new HashSet<>();
         int count=0;
         for(int i=0;i<words.length;i++){
            if(set.contains(rev(words[i]))){
                 count++;
            }else{
                set.add(words[i]);
            }
         }

        System.out.println(count);
        
    }
}
