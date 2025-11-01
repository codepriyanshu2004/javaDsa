package Basic;
import java.util.Arrays;

public class recursion{

     static void Naturalnumber(int n){
        if (n==1) {
            System.out.print("1");
            return;
            
        }

        Naturalnumber(n-1);
        System.out.print(n);
     }

 static void revNAturalnumber(int n){
    if (n==1) {
        System.out.print("1");
        return;
        
    }
    System.out.print(n);
    revNAturalnumber(n-1);
   
 }

 static int factorial (int n){
    if (n==0) {
        return 1;
        
    }
            return n*  factorial(n-1);
 }

 static int fibonacci(int n){
        if (n==0 || n==1) {
            return n;

            
        } 
        int prev = fibonacci(n-1);
        int prevprev = fibonacci(n-2);

        return  prev+prevprev;
 }
  
 
    public static void main(String [] args){

        Naturalnumber(5);

        System.out.println();

        revNAturalnumber(5);

       int a= factorial(5);

       System.out.println();

       System.out.println(a);

       System.out.println();

       System.out.print(fibonacci(7));
       System.out.println();
       
    }
}