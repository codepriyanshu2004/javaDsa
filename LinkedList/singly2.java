
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class linkedListImplematation{
    Node head = null;
    Node tail= null;

    int size=0;


    void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head==null) {
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail = temp;
        }
        size++;
    }

    void insertAtStart(int val){
        Node temp = new Node(val);
        if (head==null) {
            head=temp;
            tail=temp;
        }{
            temp.next = head;
            head=temp;
        }
        size++;
    }

    void insertAtIndex(int idx,int val){
        if (idx==0) {
            insertAtStart(val);
            return;
        }

        if (idx==size) {
            insertAtEnd(val);
            return;
        }
        if (idx<0 || idx>size) {
            System.out.println("Invalid Index");
            return;
        }

        Node temp = new Node(val);
        Node x = head;

        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }

        temp.next =x.next;
        x.next=temp;
        size++;

    }

    int get(int idx){
        if (idx<0 || idx>size) {
            System.out.println("Invalid index");
            return -1;
        }

        Node temp =head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }

        return temp.val;
    }

    void set(int idx,int val){
        if (idx<0 || idx>size) {
            System.out.println("Invalid index");
            return;
        }

        Node temp =head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }

       temp.val = val;
    }

    void deleteHead(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    void deleteAtIndex(int idx){
        if (idx==0) {
            deleteHead();
            return;
        }
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        if (idx<0 || idx>size) {
            System.out.println("Invalid index");
            return;
        }

        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
         
        if (temp.next==tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }


    void display(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    void size(){
        System.out.println();
        System.out.println("The size is"+size);
    }
}






public class singly2{
    public static void main(String[] args) {
        
        linkedListImplematation sl = new linkedListImplematation();
         sl.insertAtEnd(10);
         sl.insertAtEnd(20);
         sl.insertAtEnd(30);
          sl.insertAtEnd(40);
           sl.insertAtEnd(50);
        //    sl.display();
        //    sl.size();


           sl.insertAtStart(5);
           sl.insertAtStart(1);
            // sl.display();
            // sl.size();

            sl.insertAtIndex(2, 8);
            // sl.display();
            // sl.size();

            // System.out.println(sl.get(3));
            sl.set(2, 6);
            // sl.display();

            // sl.deleteHead();
            //  sl.display();
            //  sl.size();
           
            sl.deleteAtIndex(2);
            sl.display();
             sl.size();
             sl.deleteAtIndex(6);
             sl.display();
             sl.size();
             System.out.println(sl.tail.val);


    }
}