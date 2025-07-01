import java.util.ArrayList;
import java.util.function.Consumer;
public class LambaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i);
        }

    // Using a lambda function to iterate through the list and print each item
     //   arr.forEach((item) -> System.out.println(item * 2));  // Using a lambda function to double each item in the list


     //we can also use a Consumer functional interface to achieve the same result
     // A Consumer is a functional interface that takes a single input and returns no result.
     Consumer<Integer> fun = (item) -> System.out.println(item *2);
     arr.forEach(fun);  // Using the Consumer functional interface to apply the lambda function to


     Operation sum = (a, b) -> a + b;  // Using a lambda function to define the sum operation
     Operation prod = (a, b) -> a * b;
     Operation sub = (a, b) -> a - b;

     LambaFunction myCalculator = new LambaFunction();
     System.out.println(  myCalculator.operate(5, 10, sum));
     System.out.println(  myCalculator.operate(5, 10, prod));
     System.out.println(  myCalculator.operate(5, 10, sub));
     


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);  // Using the operation method from the Operation interface
    }
}


interface Operation {
    int operation(int a, int b);  // Method to perform the sum operation

    
}