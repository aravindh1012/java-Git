import java.util.Arrays;
import java.util.Scanner;
public class Myarray{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        // int[] ros;  
        // ros = new int[5];
        // System.out.println(ros[1]);

       // int[] my; //declaration of arry. my is getting defined in the stack
       // my = new int[5]; // initialisation: actually here object is being created in heap memory
    //    int[] arr = new int[5];
       
       
    //    for(int i= 0;i<arr.length;i++ ){
    //     arr[i] = in.nextInt();
    //    }
    //    for(int i= 0;i<arr.length;i++ ){
    //     System.out.print(arr[i] + " ");
    //    }

    // for each method
    //    for(int num : arr){
    //     System.out.print(num + " ");
    //    }
         String[] sys = new String[4];
         for(int i = 0; i<sys.length; i++){
            sys[i] = in.next();
         }
         System.out.print(Arrays.toString(sys));
    }
}
