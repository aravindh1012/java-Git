public class StaticBlock {
    static int a = 10;
    static int b;

    static{
        System.out.println("static block is executed");
        b = a * 4; // Initializing static variable b using static block
        
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock(); // Creating an instance of StaticBlock
        System.out.println("Value of a: " + a + ", Value of b: " + b); // This will print the value of a and b
        // This will print the value of b initialized in the static block
        StaticBlock.b += 10;
        System.out.println("Updated Value of b: " + b); // This will print the updated value of b


        // The static block is executed only once when the class is loaded, so b will retain its value across instances.
        StaticBlock obj2 = new StaticBlock(); // Creating another instance of StaticBlock
        System.out.println("Value of a: " + obj2.a + ", Value of b: " + obj2.b); // This will print the value of a and b again
    }
}
