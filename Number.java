public class Number {
    double sum(double a, int b) {  //
           return a + b;
    }
    
    int sum(int a, int b) {  //method overloaded the above method
           return a + b;
    }

    int sum(int a, int b, int c) {  
           return a + b + c;
    }

    public static void main(String[] args) {
        
        Number number = new Number();
         
        //number.sum(1, 3);  
        number.sum(3, 5, 6);   //method overloading example

        System.out.println( number.sum(1, 3));
    }
}
