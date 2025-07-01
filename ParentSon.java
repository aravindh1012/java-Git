public class ParentSon extends ParentAbs {
    

    // public  ParentSon(int age) {  // Call the constructor of ParentAbs
    //     this.age = age;
    // }

    public ParentSon(int age) {
        super(age);
    }

   



    @Override
    void career() {
        
     System.out.println("i am want be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love hulk");
    }
    
}
