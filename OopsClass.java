import java.util.Arrays;

public class OopsClass {
    public static void main(String[] args) {
       
        int[] rno = new int[5];  // Array to store roll numbers
        String[] name = new String[5];  // Array to store names
       float[] marks = new float[5]; 

       Student[] students = new Student[5];

       //just declare the object
       // Create a new Student object and assign values
       Student arvind = new Student();

    //      arvind.rno = 10;
    //      arvind.name = "Arvind";
    //      arvind.marks = 83.5f;

    //    System.out.println(arvind.rno);
    //    System.out.println(arvind.name);
    //    System.out.println(arvind.marks);
        arvind.Greeting();


        }
    }
// Class to represent a Student
    class Student{  
         int rno;
         String name;
         float marks;

         void Greeting(){
            System.out.println("Hello, my name is " + name + " and my roll number is " + rno + ".");
         }
         
         // Default constructor
         Student(){
            this.rno = 19;
            this.name = "kalai";
            this.marks = 67.09f;
            
         }
    }

