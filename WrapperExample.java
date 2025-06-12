public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);// This will print the original values
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);// This will still print the original values because primitives are passed by value
        // in Java, primitives are passed by value, meaning that a copy of the variable is passed to the method.
  

        final A kd = new A("kalai");
        kd.name = "lilly";

      //when a non primitive is declared as final, it means that the reference to the object cannot be changed, which means you cannot reassign it.
        System.out.println("Name: " + kd.name);
        
        // Uncommenting the next line will cause a compilation error because num is final
        // kd.num = 20;

    }
    static void swap(int a, int b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A{
    final int num = 10; // Final variable, cannot be changed
    String name;

    public A(String name) {
        this.name = name;
    }
}
