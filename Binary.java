public class Binary {
    public static void main(String[] args) {
        //In binary search first we have to find the middle number of an array.
        // while using binary search the array should be sorted.
        // if the middle number is equal to the target number then return the index of the middle number.
        int[] arr = {-10, -5, -2, 0, 2, 4, 5, 7, 9, 13, 24, 56, 67, 89};
        int target = 9;
        int ans = binarySearch(arr, target);

    // here i printing index of the target. 
        System.out.println(ans);
        
       
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        
        while(start <= end){
             int mid = start + (end - start) / 2;

             if(target < arr[mid]){
                end = mid - 1;
             }
             else if(target > arr[mid]){
                start = mid + 1;
             } 
             else{
                return mid;
             }
        }
        return -1;
    }


}

