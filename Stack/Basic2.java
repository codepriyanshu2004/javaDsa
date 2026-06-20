import java.util.Stack;

public class Basic2{
    public static void main(String[] args){


  // Reverse stack


        // Stack<Integer>st = new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);

        // // while(st.size()>0){
        // //     System.out.println(st.pop());
        // // }

        // System.out.println(st);

        // Stack<Integer> revStack = new Stack<>();

        // while(!st.isEmpty()){
        //     int ele = st.pop();
        //     revStack.push(ele);
        // }

        // System.out.println(revStack);


        // copy stack into another stack in same order 

        // Stack<Integer> st = new Stack<>();

        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);

        // System.out.println(st);

        // Stack<Integer> cS = new Stack<>();

        // while(!st.isEmpty()){
        //     int ele = st.pop();
        //     cS.push(ele);
        // }

        // System.out.println(cS);

        // Stack <Integer> FinalStack = new Stack<>();
         
        // while(!cS.isEmpty()){
        //     int ele = cS.pop();
        //     FinalStack.push(ele);
        // }

        // System.out.println(FinalStack);


        // push element at bottom of stack

        // Stack<Integer> st = new Stack<>();

        // st.push(5);
        // st.push(10);
        // st.push(20);
        // st.push(30);

        // System.out.println(st);

        // Stack<Integer> cS = new Stack<>();

        // while(st.size()>0){
        //     int ele = st.pop();
        //     cS.push(ele);
        // }

        // System.out.println(cS);

        // st.push(50);

        // while(cS.size()>0){
        //     int ele = cS.pop();
        //     st.push(ele);
        // }

        // System.out.println(st);




        // push element in any index
       

        int index =2;

        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);

        Stack<Integer> cS = new Stack<>();

        while(st.size()>=index){
            int ele = st.pop();
            cS.push(ele);
        }

        System.out.println(cS);

        st.push(50);

        while(cS.size()>0){
            int ele = cS.pop();
            st.push(ele);
        }

        System.out.println(st);









    }
}