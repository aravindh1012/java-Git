import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        
    //     list.add(78);
    //     list.add(89);
    //     list.add(99);
    //     list.add(109);
    //     list.add(119);  // to add value in array list.add
          
    //    System.out.print(list.contains(109)); // is used to identify the value present in the array 
    //      System.out.println(list.indexOf(109)); // is used to identify the index of the value present in the array
    //       System.out.println(list.get(2)); // is used to get the value at a particular index
    //       System.out.println(list.size()); // is used to get the size of the array
    //       System.out.println(list.isEmpty()); // is used to check if the array is empty or not
    //       list.remove(2); // is used to remove the value at a particular index
    //       System.out.println(list);
    //       list.set(1, 100); // is used to set a value at a particular index

    //    System.out.println(list);


    //input 
    for( int i=0; i< 5; i++){
        list.add(in.nextInt());
    }
    //get the item at any index
    for(int i=0; i<5; i++){
        System.out.println(list.get(i));
    }

    // print the array list
    System.out.println(list);
     
     }     
}
