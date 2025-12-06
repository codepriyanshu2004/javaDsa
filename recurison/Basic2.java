public   class Basic2{


    static int fibonaaco(int n){
   
        if (n==0 || n==1) {
             return n;
        }


        return fibonaaco(n-1)+fibonaaco(n-2);
    }

     static int stairPath(int n){
   
        if (n==1 || n==2) {
             return n;
        }


        return stairPath(n-1)+stairPath(n-2);
    }

    static void print(int i,int n){
    
        if (i>n) {
           return; 
        }
        
        System.out.println(i);
        print(i+1, n);
    }


    static void PrintArr(int i,int [] arr){
        
      if (i==arr.length) {
          return;
      }

        System.out.println(arr[i]);
        PrintArr(i+1, arr);
    }

   static void PrintString(int i,String s){
     
    if (i==s.length()) {
        
        return;
    }
   
    System.out.print(s.charAt(i));

    PrintString(i+1, s);
   }


   static void skip(int i,String s,String ans){


    if (i==s.length()) {
        System.out.println(ans);
        return;
    }
     
    if (s.charAt(i)!='a') {
        ans+=s.charAt(i);
    }

    skip(i+1, s,ans);

   }


    public static void main(String[] args) {
        
        // System.out.println(fibonaaco(6));
        // System.out.println(stairPath(5));

        // int i=0;int n=7;
        // print(i,n);
          
        // int [] arr = {10,20,30,40,50};
        // PrintArr(0,arr );


        // String s = "Priyanshu";
        // PrintString(0, s);


        //skip chracter a

        String s = "Raghav sarma";
        String ans = "";
        skip(0, s, ans);

    }
    
}