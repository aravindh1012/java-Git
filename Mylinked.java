

public class Mylinked {


    private Node head;
    private Node tail;
    private int size;

    public Mylinked(){
        this.size = 0;  // Initialize the size of the linked list to 0
    }

    public void firstNode(int val){
        Node node =  new Node(val);  // Create a new node with the given value
        node.next = head;           // Set the next of the new node to the current head
        head = node;    // Update the head to the new node

        if(tail == null){
            tail = head; 
             // If the list was empty, set tail to the new node
        }
        size += 1;
         // Increment the size of the linked list
    }



    public void insertLast(int val){
        if(tail == null){
            firstNode(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void Display(){
        Node temp = head;  // Start from the head of the list
       while(temp != null){
        System.out.print(temp.value + " -> ");
        temp = temp.next;

       }
       System.out.println("end");
    }



    private class Node{

    private int value;
    private Node next;

    public Node(int value){
        this.value = value;  // Initialize the node with a value
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;  // Initialize the node with a value and a reference to the next node
    }
 }
}



