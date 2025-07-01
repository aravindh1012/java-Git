public class CustomArraylist {
    private int[] data;
    private static int Default_Size = 10;
    private int size = 0;


    public CustomArraylist(){
        this.data = new int[Default_Size];
        if(isFull()){
            DoubleIt();
        }
    }

    public boolean isFull(){
        return size == data.length;
    }

    private void DoubleIt(){
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public static void main(String[] args) {
        Arraylist list = new Arraylist();

    }
}
