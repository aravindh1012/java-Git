public class Circle extends Shapes {
     //this will run when obj of circle is created
     // hence it is overriding the parent method shapes area method
      @Override  //this is called annotation
      // this is used to tell the compiler that this method is overriding the parent method
      void area() {
            System.out.println("Area of circle is pie * r * r");
      }
      
      
}
