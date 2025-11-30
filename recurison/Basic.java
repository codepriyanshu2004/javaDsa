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

        print(n-1);
        System.out.println(n);
      
    }
    public static void main(String[] args) {

        // int ans = fact(5);
        // System.out.print(ans);

        int ans = print(5);
        System.out.println(ans);
       print2(4);
        
    }
}
