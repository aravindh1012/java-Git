import java.util.Arrays;
public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        swap(arr, 2, 4);   // here we are passing the array and the index of the elements to be swapped
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){  
        int temp = arr[i]; // here we are creating a temporary variable to store the value of the first element
        arr[i] = arr[j]; // here we are assigning the value of the second element to the first element
        arr[j] = temp; // here we are assigning the value of the first element to the second element
    }
}
