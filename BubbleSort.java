import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     // bubble sort is used to sort the array comparing adjacent element(next element) if it is greater it will exchange the position in the array.
     // In bubble sort first part of largest element in array will come to end.
     int[] arr = {3, 2, 1, 4, 6, 5};
     bubble(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j < arr.length-i;j++){
                //swap if number is less than previous number
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }

    }
}
