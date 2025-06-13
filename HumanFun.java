public class HumanFun {
    public static void main(String[] args) {
         Human arvind = new Human(23, "Arvind", 20000, false);
            Human kalai = new Human(24, "Kalai", 30000, true);

         System.out.println(arvind.name);
         System.out.println(Human.populationCount); // Accessing static variable populationCount
         System.out.println(kalai.age);
    }
}
