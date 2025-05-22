public class MyTest {
    public static void main(String[] args) {
        Numbers();
    }
    public static void Numbers(){
        int[] arr = {1, 2, 3};
        int[] arr1 = {1,2,1, 3, 1, 3};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr1.length; i++){
                if(arr[i]==arr1[j]){
                   count++;
                }
               System.out.println(arr[i] + " : " + count); 
            }
        }
    }
}
