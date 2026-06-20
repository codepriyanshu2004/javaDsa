class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;

    }
}

class StackLinkedList{
    Node head=null; int size=0;

    void push(int x){
        Node temp = new Node(x);
        temp.next=head;
        head = temp;
        size++;
    }

    int pop(){
        if (head==null) {
            System.out.println("Stack is Empty");
            return -1;
            
        }
        int top = head.val;
        head = head.next;
        size--;

        return top;
    }

    int peek(){
         if (head==null) {
            System.out.println("Stack is Empty");
            return -1;
            
        }
        return head.val;

    }

    boolean isEmpty(){
        if (head==null) {
            return true;
            
        }
        return false;
    }

    void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val+" ");
            temp = temp.next;
            
        }
    }
}


public class Basic5 {
    public static void main(String[] args){
        StackLinkedList st = new StackLinkedList();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // st.display();
        // System.out.println(st.pop());
        // System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();


    }
    
}
