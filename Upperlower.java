import java.util.Scanner;

public class Upperlower {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        char word = my.next().trim().charAt(0);

        if(word >= 'a'&& word <= 'z'){
            System.out.println("lowerscase");

        }else if(word >= 'A' && word <= 'Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
