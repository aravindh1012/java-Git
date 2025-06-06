public class Recursion {
    public static void main(String[] args) {
        // why recursion is helps us in solving bigger/complex problem in simple way
        // recursion is a technique where a function calls itself to solve a problem
        // we can convert recursion solution into iteration and vice versa(iteration means using loops)
        // but its take more memory and space complexity is not constant o(n) because of recursive calls or function calls
        // recursion is used in many algorithms like quicksort, mergesort, binary search, etc.

        //any recursive solution is converted into formula it is recurrence relation
        //recursion
        //how function works is while function is not finished excuting it will remain in the stack memory
        //when function is finished executing it will be removed from the stack memory
        // the flow of program where restore where the function was called
        //recursion is a function that calls itself
        // base case is the condition that stops the recursion
        // recursive case is the condition that continues the recursion
        //if no base case or condition function keeps calling itself and will cause stack overflow error
        // every function call takes some memory in the stack
        print1(1);
    }
    public static void print1(int n) {
        //base condition
        if(n == 5){ 
            System.out.println(5);
            return; 
        }
        System.out.println(n);

        //this is tail recursion
        //this is called last function call
        print1(n + 1);  // recursive call
    }
}
