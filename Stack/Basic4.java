

class StackArray {   // stack implementation using Array

    int [] arr = new int[5];
    int idx=0;

    void Push(int x){
        if(arr.length==idx){
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = x;
        idx++;
    }

    int peek(){
        if(idx==0){
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[idx-1];
    }

    void display(){
        if (idx==0) {
            System.out.println("Stack is Empty");
            return;
            
        }

        for(int i=0;i<=idx-1;i++){
            System.out.println(arr[i]);
        }
    }

    int size(){
        return idx;
    }

    boolean isEmpty(){
        if (idx==0) {
            return true;
            
        }
        return false;
    }
   
    boolean isFull(){
        if(arr.length==idx){
            return true;
        }
        return false;
    }

    int pop(){
        if (idx==0) {
            System.out.println("Stack is Empty");
            return -1;
            
        }
        int top = arr[idx-1];
        arr[idx-1] =0;
        idx--;
        
        return top;
    }
}


class Basic4{
    public static void main(String [] args){
        StackArray  st  = new StackArray ();
        System.out.println(st.isEmpty());
        st.Push(10);
        st.Push(20);
        st.Push(30);
        st.Push(40);
    //    System.out.println( st.isFull());
    //    System.out.println(st.peek());
    //    st.display();
         System.out.println(st.size());
         System.out.println(st.pop());
         st.display();


    }
}