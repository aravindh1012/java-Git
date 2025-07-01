public class ParentDaughter extends ParentAbs {

    // public  ParentDaughter(int age) {
    //     this.age = age;
    // }

    public ParentDaughter(int age) { // Call the constructor of ParentAbs
        super(age);
    }  


    @Override
    void career() {
        
        System.out.println("i am want be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love hulk");
    }
}
