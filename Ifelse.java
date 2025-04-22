public class Ifelse {
   
        public static void main(String[] args){
            int salary = 10000;
            if(salary > 10000){                    // if condition is true it will print(30000)
                salary += 20000;
            }else if(salary < 10000) {            //else if conditon is true it will output (25000)
                salary  += 15000;
            }else {                               //if both  condition is false it will print the else finally (20000)
                salary += salary;
            }
            System.out.println(salary);
        
    }
}
