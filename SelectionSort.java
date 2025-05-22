import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i =0; i < arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, last);
        }

        private static int getMaxIndex(int[] arr, int start, int end){
            int max = start;
        }
    }
}
