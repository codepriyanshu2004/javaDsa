package Basic;
import java.util.Scanner;

public class ifElse {

    static void prime(int n){
        int count = 0;
        for(int i=2;i<=n-1;i++){
            if (n%i==0) {
                count++;
            }
        }

        if (count==2) {
            System.out.println("Not prime");
            
        }else{
            System.out.println("prime");
        }
    }


     static boolean primes(int n){
       
        for(int i=2;i<=n-1;i++){
            if (n%i==0) {
                return false;
            }
        }

      return true;
    }

   static void  primeRange(int n){

     for(int i=2;i<=n;i++){
       if (primes(i)) {
        System.out.print(i+" ");
        
       }
       
     }
     System.out.println();
   }

     


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();

        // if (n%2==0) {
            
        //     System.out.println("Even");
        // }else{
        //     System.out.println("odd");
        // }
       

    //    int a=5;
    //    int b =6;
    //    int c = 7;

    //    if (a>b && a>c) {
    //     System.out.println("A is gearter");
        
    //    }else if (b>a && b>c) {
    //     System.out.println("b");
        
    //    }
    //    else if (c>a && c>b) {
    //     System.out.println("c");
    //    }


//     int n= sc.nextInt();
   
//     if (n%3==0 || n%5==0) {
//         if (n%15!=0) {
//             System.out.println("The number is id divsible by 3 and 5 not by 15");
//         }else{
//             System.out.println("not macthing");
//     }}
//     else{
//         System.out.println("not macthing");
// 


// }

   
// int a =1;
//  switch(a){
//     case 1:
//     System.out.println("monday");
//     break;
//     case 2:
//  System.out.println("Tuesday");
//    break;

//    default:
//    System.out.println("wrong no");
//  }



//   int num =10;
//   for(int i=0;i<=20;i++){
//     if (i==num) {
       
//         break;
//     }
//     System.out.println(i);
   
//   }



// for(int i=0;i<=10;i++){
//     if(i==5){
//         continue;
//     }
//     System.out.println(i);
// }


// count the digit int the number

// int n = sc.nextInt();
// int count=0;
// int org =n;

// while (n>0) {
//   n=n/10;
//   count++;
  
// }
// System.out.println(count);



// sum for digit of number

//  int n =sc.nextInt();
//  int sum =0;

//  while (n>0) {

//   sum += n%10;
//   n=n/10;


  
//  }
//  System.out.println(sum);
 
//     }}

// int n =sc.nextInt();
// int sum=0;
// for(int i=1;i<=n;i++){
//   sum+=i;
// }
// System.out.println(sum);
//     }}

// for(int i=1;i<10;i++){
//   System.out.println(i);

// }

// reverse the digit

// int n = sc.nextInt();
// int ans =0;

// while (n>0) {
//   ans = ans*10+n%10;
//   n=n/10;
  
// }
// System.out.println(ans);


// int n = 564;
//  int ans = 0;

//  while (n>0) {
//     ans = n%10;
//      System.out.println(ans);
//    n=  n/10;
    
//  }

// }}

// if number is even substract and odd thn add

// int n = sc.nextInt();
// int ans=0;
// for(int i =1;i<=n;i++){
//   if (i%2==0) {
//     ans-=i;
    
//   }else{
//     ans+=i;
//   }
// }
// System.out.println(ans);


// factorial

// int n =sc.nextInt();;
// int fact =1;

// for(int i =1;i<=n;i++){
//   fact*=i;
// }
// System.out.println(fact);

//     }}


// finding a raised to power b;

// int a=2,b=5;
// int ans=1;

// for(int i=1;i<=b;i++){
//   ans=ans*a;
// }
// System.out.println(ans);

// }}








// int a =1;
// for(int i=0;i<=4;i++){
//     System.out.print(a+" ");
//     a*=2;
// }
//     }}





// prime number
//  int n = 5;
//  int count =0;
// for(int i=2;i<=n-1;i++){
//     if (n%i==0) {
//         count++;
      
        
//     }
// }

// if (count==2) {
//     System.out.println("not prime");
    
// }else{
//       System.out.println(count);
//     System.out.println("prime");
// }


// }}



// for(int i =1;i<=4;i++){
//     for(int j=1;j<=4;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }}


// for(int i=6;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();


// }}
  


// for (int i =1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();

// }}



// for(int i=1;i<=6;i++){
//   for(int j=1;j<=i;j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }
    


// for(int i = 1;i<=4;i++){
//     for( int j=1;j<=6;j++){
//         if (i==1 || i==4 || j==1 || j==6) {
//               System.out.print("*");
            
//         }
//         else{
//             System.out.print(" ");
//         }
    
//     }
//      System.out.println();
// }

 




// for(int i =1;i<=4;i++){
//     for(int j=1;j<=i;j++ ){
//         System.out.print( (char) (j+64)+" ");
//     }
//     System.out.println();
// }

//     }}


//  char ch ='A';
// for(int i= 1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(ch);
//         ch++;
//     }
//     System.out.println();

// }
//     }}





// prime(6);
 
// System.out.println(primes(6));
   

    primeRange(10);

    }}

 
 
    