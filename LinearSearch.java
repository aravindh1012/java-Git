public class LinearSearch {
    public static void main(String[] args) {
        int[] Mylist = {1, 4, 7, 87, 45, 30, 47};
        int target = 87;
        int answer = linear( Mylist,  target); 
        System.out.println(answer);
    }
    // to check the index of the target element
    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){

        //check element at every index if it is = target.
            int element = arr[index];
            if(element == target){
               return index;
            }
            
        }
        //this line will executed if none of the return statement above have executed.
        //hence the target not found.
        return -1;
    }
}
