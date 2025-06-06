public class BinaryInRecursion {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 31, 45, 59, 64, 76, 87, 99};
        int target = 76;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1; // target not found
        }
        int mid = (start + end)/2; // find the middle index
        //base case
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return binarySearch(arr, target, start, mid -1);
        }else{
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}
