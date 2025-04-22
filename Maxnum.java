public class Maxnum {
    public static void main(String[] args) {

        // this is the maximum number in the array
    //     int[] arr = {3, 6, 89, 98, 46, 78, 89};
        
    //     System.out.println("the maximum number is : "+ maxi(arr));
    // }
    // static int maxi(int[] arr){ 
    //     int max = arr[0];
    //     for(int i=1; i<arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
    //             return max;

  
    // this is range of maximum number
    int[] arr = {3, 6, 89, 98, 46, 78, 89};
        
    System.out.println("the maximum number is : "+ maxi(arr, 1, 6));
}
static int maxi(int[] arr, int start, int end){ 
    int max = arr[0];
    for(int i=start; i<end; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
            return max;
    }
    
}
