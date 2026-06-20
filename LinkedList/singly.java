class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class singly {

    static void DisplayRecursively(Node head){
          
      if (head==null) {
          return;
      }

        System.out.println(head.val);
        DisplayRecursively(head.next);
    }


    static void displayReverseRecursively(Node head){
          
      if (head==null) {
          return;
      }
        displayReverseRecursively(head.next);
        System.out.println(head.val);
        
    }
    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;       //linking with nodes
        b.next = c;
        c.next = d;
        d.next = e;

    //    System.out.println(a.val);
    //    System.out.println(b);    //store address 
    //    System.out.println(b.val);

    //    System.out.println(a.next.val);
    //    System.out.println(b.next.val);

    //    System.out.println(a.val);
    //    System.out.println(a.next.val);
    //    System.out.println(a.next.next.val);
    //    System.out.println(a.next.next.next.val);
    //    System.out.println(a.next.next.next.next.val);


    //   Node temp = a;                //head noe
    //   System.out.println(temp.val);    //10
    //   temp = temp.next;
    //   System.out.println(temp.val);   //20;

       // Displaying using for loop
       
    //     Node temp = a;
        
    //    for(int i=1;i<=5;i++){
    //     System.out.println(temp.val);
    //      temp = temp.next;
    //    }

    // Displaying using while loop

    // Node temp = a;
     
    // while (temp!=null) {
    //      System.out.println(temp.val);
    //      temp=temp.next;
    // }
     

    // Displaying using recursivly

//    DisplayRecursively(a);

   // reverse display
       
   displayReverseRecursively(a);
    }
}
