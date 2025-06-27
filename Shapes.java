public class Shapes{
      void area(){
            System.out.println("this is a shape");
      }



     //final keyword is used to prevent method overriding
     // if we use final keyword before the method name then it will not allow overriding
     // if we use final keyword before the class name then it will not allow inheritance
     //when ever we use final in class the methods of that class will not be overridden
     // if we use final keyword before the variable name then it will not allow reassigning
     // we cannot override in static methods

     // we can inherit the static method but we cannot override it


     //Early binding is done at compile time
     //Late binding is done at runtime


     //this is Early binding
    //  final void area(){
    //       System.out.println("this is a shape");
    // }
}