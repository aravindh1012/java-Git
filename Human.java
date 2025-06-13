public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long populationCount;  // static is used to define class-level variables that are shared among all instances of the class
     // Static variable to keep track of population count
    // Static block to initialize population count

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.populationCount++; // Increment population count whenever a new Human object is created
        
    }
}
