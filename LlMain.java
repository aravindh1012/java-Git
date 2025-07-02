import java.util.LinkedList;

public class LlMain {
    public static void main(String[] args) {
        LinkedListPro list = new LinkedListPro();
        list.firstNode(3);
        list.firstNode(4);
        list.firstNode(15);
        list.firstNode(17);
        

        Mylinked list1 = new Mylinked();
        list1.firstNode(3);
         list1.firstNode(5);
         list1.firstNode(8);
         list1.insertLast(67);

         list1.Display();
            

        list.Display();
    }
    
}
