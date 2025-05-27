public class StringProblem {
    public static void main(String[] args){
        //string pool is separate memory structure inside the heap. (all the similar values of strings are not like recreated the same object in the pool)
        //immutablity string cannot be changed in java in object(if we need to change the string we need to create a new object)for security purpose
        String name1 = "Aravindh";
        String name2 = "Aravindh";

        String name3 = new String("Aravindh"); // this creates a new String object in the heap memory, not in the string pool
        String name4 = new String("Aravindh");  // so name3 and name4 are not the same object, but they have the same content
        // == checks if both references point to the same object in memory
        // equals checks if the content of the strings is the same

        System.out.println(name1 == name2); // true, because both refer to the same object in the string pool
        System.out.println(name3 == name4); // false, because both refer to different objects in the heap
        System.out.println(name3.equals(name4)); // true, because the content is the same(equal is a method in the String class that checks the content of the strings)
        

        // String method
        System.out.println(name1.charAt(0)); // charAt is used to get the letter using index
    }
}
