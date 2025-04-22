import java.util.Scanner;


public class First {
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter three numbers: ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        // Finding the largest number using Math.max()
        int largest = Math.max(c, Math.max(a, b));

        // Displaying the result
        System.out.println("The highest number is: " + largest);

        // Closing scanner
        inp.close();
    }
}
