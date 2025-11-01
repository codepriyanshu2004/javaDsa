package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day5ArrayList {

   static void reservess(ArrayList<Integer>l){
    int i=0; int j=l.size()-1;

    while (i<j) {

      Integer temp = l.get(i);
      l.set(i,l.get(j));
      l.set(j,temp);
      i++;
      j--;

      
    }
   }

  

   static int sum(ArrayList<Integer>l){
     int sum=0;

     for(int i=0;i<l.size();i++){
      sum+=l.get(i);
     }
     return sum;
   }

   

    
  
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
        ArrayList <Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);   //1234
        l.add(4);
        l.add(5);
 
      // System.out.println( l.get(1));  ;//2
        
        // for(int i =0;i<l.size();i++){
        //     System.out.println(l.get(i)); //12345
        // }

        // System.out.println(l); //12345

        // l.add(1,100); //1 100 2 3 4 5
        // System.out.println(l);

        // l.set(1, 10); // 1 10 2 3 4 5
        // System.out.println(l);

        // l.remove(1);
        // System.out.println(l);

        // l.remove(Integer.valueOf(2)); // 1 2 3 4 5
        // System.out.println(l);

        // boolean ans = l.contains(Integer.valueOf(10));
        // System.out.println(ans);
        // System.out.print(l);

        // ArrayList<Integer>list = new ArrayList<>();

        // list.add(1);list.add(2);list.add(3);
         
      //  reservess(list);
          
      //  System.out.println(list);
      //  int a=sum(list);
      //  System.out.println(a);

        // Collections.reverse(list);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

      //   System.out.println(list.indexOf(3));
      //   System.out.println(list.lastIndexOf(3));
      //  System.out.println( list.isEmpty());


        // ArrayList <String> list = new ArrayList<>();
        

        // list.add("priyanshu"); list.add("aman"); list.add("rahul"); list.add("vivek" );

      //   System.out.println(list);
      // Collections.reverse(list);
      // System.out.println(list);
      // Collections.sort(list);
      // System.out.println(list);
      // Collections.sort(list,Collections.reverseOrder());
      // System.out.println(list);
     
         
      // 2D Arraylist

    //   List<Integer> a = new ArrayList<>();
    //   a.add(10); a.add(20); a.add(30);
       
    //   List<Integer> b= new ArrayList<>();
    //   b.add(40); b.add(50); 

    //    List<Integer> c= new ArrayList<>();
       
    //     List<Integer> d= new ArrayList<>();
    //   d.add(60); 

    //    List<List<Integer>>L= new ArrayList<>();
    //  L.add(a); L.add(b); L.add(c);L.add(d);

    //  System.out.println(L.get(1).get(1));

    //  for(int i =0;i<L.size();i++){
    //   System.out.println(L.get(i));
    //  }

    //   for(int i =0;i<L.size();i++){
    //   for(int j=0;j<L.get(i).size();j++){
    //   System.out.print(L.get(i).get(j)+" ");
    //   }
    //   System.out.println();
    //  }
       
       
     

    }
    
}
