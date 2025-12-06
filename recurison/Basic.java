public class Basic {

    static int fact(int n){
    if (n==1) {
        return 1;
    }
        return n*fact(n-1);
    }


    static int print(int n){

    if (n==1) {
        return 1;
    }
        System.out.println(n);
        return print(n-1);
    }


     static void print2(int n){

     if (n==1) {
        System.out.println(n);
        return;
        
     }

     print2(n-1);
     System.out.println(n);
      
    }
    

    static int sum(int n){
     
        if (n==0 || n==1) {
            return 1;
            
        }

        return n+sum(n-1);
    }
  
    static int pow(int a,int b){
     
     if (b==0) {
        return 1;
        
     }

        return a* pow(a , b-1);
    }

    public static void main(String[] args) {

        // int ans = fact(5);
        // System.out.print(ans);

        // int ans = print(5);
        // System.out.println(ans);
    //    print2(4);

    // int ans= sum(5);
    // System.out.println(ans);

    int ans = pow(2, 4);
    System.out.println(ans);

        
    }
}
