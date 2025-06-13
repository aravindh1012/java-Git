public class InnerClasses {
    static class Inner {
        String name;

         Inner(String name) {
            this.name = name;
        }

        
        
    } 
    public static void main(String[] args) {
        Inner a = new Inner("Arvind"); // Creating an instance of the inner class
        Inner b = new Inner("kalai"); // Creating another instance of the inner class
        System.out.println( a.name);
        System.out.println( b.name);
    }
}
