import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        /*Syntax of for loop
         for (initialisation; condition; increment/ddecrement){
         
         // body
         }
         */


         Scanner in = new Scanner(System.in);
         System.out.print("enter the number: ");
         int n = in.nextInt();
       
         
         for(int num = 1; num <=n; num++){
            System.out.println(num);
         }
         
         in.close();
    }

}
