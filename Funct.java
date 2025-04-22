import java.util.Scanner;
public class Funct {
    public static void main(String[] args) {
        sum();
       System.out.println("the answer is: " + sum2());

    }

    // return type is used..
       static int sum2(){
           Scanner in = new Scanner(System.in);
           System.out.print("enter the number1 : ");
           int num1 = in.nextInt();
           System.out.print("enter the number2 : ");
           int num2 = in.nextInt();
           int sum = num1 + num2;
           return sum;  
       }
    // function calling method

    static void sum(){
        Scanner my = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = my.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = my.nextInt();
        int total = num1 + num2;
        System.out.println("the total value of two numbers :" + total);
    }
}
