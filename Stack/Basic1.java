import java.util.Stack;

public class Basic1{
    public static void main(String[] args){

        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st.isEmpty());

        System.out.println(st); // 10 20 30 40 50

        System.out.println(st.pop()); //50

        System.out.println(st); // 10 20 30 40

        System.out.println(st.peek());

        System.out.println(st.size());


        // To access first element in stack // 10

        while(st.size()>1){
            st.pop();
        }

        System.out.println(st.peek()); // 10


    }
}