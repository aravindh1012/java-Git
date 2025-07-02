import java.util.LinkedList;

public class LinkedListPro {
    // public static void main(String[] args) {
    //     LinkedList<Integer> list = new LinkedList<>();
    //     // Adding elements to the LinkedList
    //     list.add(10);
    //     list.add(12);
    //     System.out.println(list);
  //  }
     

    // LinkedListPro class to implement a simple linked list with basic operations
     private Node head;
     private Node tail;
     private int size;

     public LinkedListPro() {  // Constructor to initialize the linked list
         this.size = 0;
     }

    
     
     public void firstNode(int val){  // Method to add a new node at the beginning of the linked list
        Node newNode = new Node(val);  // Create a new node with the given value
        newNode.next = head;           // Set the next of the new node to the current head
        head =  newNode;    // Update the head to the new node
        
        // If the list was empty, set tail to the new node
        if(tail == null){
            tail = head;
        }
        size += 1;
     }
      //
      public void Display(){  // Method to display the linked list
        Node temp = head;     // Start from the head of the list
        while(temp != null){  // Traverse through the list
            System.out.print(temp.value +" -> ");
            temp = temp.next;  // Move to the next node
        }
        System.out.println("end");
     }


        private class Node{    // Inner class to represent a node in the linked list
           private int value;
           private Node next;
         
           public Node(int value){  // Constructor to initialize a node with a value
            this.value = value;
           }

           public Node(int value, Node next){  // Constructor to initialize a node with a value and a reference to the next node
            this.value = value;
            this.next = next;
           } 


        }
}
