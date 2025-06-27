public class Abs {
    private int num; //data member here we cannot directly access this num because it is private but we can access it through the constructor
    String name;           //data member
    int[] arr;             //data member


    public void getNum(){   // method to access the private data member
        System.out.println("Num: " + num);
    }

    public Abs(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
