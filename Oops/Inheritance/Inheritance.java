package Oops.Inheritance;

public class Inheritance {
        double l;
    double h;
    double w;

    Inheritance(){ // Default constructor
        // This constructor initializes the dimensions to -1, indicating they are not set.
        this.l = -1;
        this.h = -1;    
        this.w = -1;
    }

    //cube
    Inheritance(double side){ // single parameter constructor
        this.l = side;
        this.h = side;
        this.w = side;
    }

    // three parameters
    Inheritance(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    //copy constructor is used to create a new object as a copy of an existing object.
    Inheritance(Inheritance obj){ // Copy constructor
        this.l = obj.l;
        this.h = obj.h;
        this.w = obj.w;
    } 
    //this method 
    public void display(){
        System.out.println("Running the inheritance class");
    }
}

