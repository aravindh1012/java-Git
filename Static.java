public class Static {
    public static void main(String[] args) {
        
         fun(); // Calling static method we can call it directly without creating an instance of the class

        // To call a non-static method, we need to create an instance of the class
        //  Static obj = new Static(); // Creating an instance of Static class
        //  obj.greet(); // Calling non-static method using the instance
        Static obi = new Static(); // Creating an instance of Static class
        obi.fun2(); // Calling non-static method using the instance and it will call the greet method inside it
    }
      static void fun(){
        // Static obi = new Static(); // Creating an instance of Static class
        // obi.greet(); // Calling non-static method using the instance
        System.out.println("hello I am static function");
      }

      void fun2(){
        greet();
        System.out.println("hello I am non static function");
      } 

       void greet(){
        System.out.println("hello I am Arvind");
    }
}
