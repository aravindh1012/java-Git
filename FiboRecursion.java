public class FiboRecursion {
    public static void main(String[] args) {
        // Fibonacci series using recursion
        //fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)  like formula
       System.out.println(fibonacci(6));
               
    }
    public static int fibonacci(int n){
        //base case
        if(n < 2){
            return n;
        }
        return fibonacci(n -1) + fibonacci(n-2); // recursive case
    }
    
}
