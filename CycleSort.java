import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // In cycle sort check the first index and move to correct index and swap it and repeat the process.
        //if range is 1 to N every element will be at index = value-1
        // if range is 0 to N every element will be at index = value
        int[] arr = {3,4,5,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        }
        static void sort(int[] arr){

            int i = 0;
            while(i < arr.length){
                int correctIndex = arr[i] - 1;  // value - 1
                if(arr[i] != arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }else{
                    i++;
                }
             }
        }
}
