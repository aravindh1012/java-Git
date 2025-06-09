public class LeetcodeEasy {
      public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3};
        int target = 5;
        System.out.println(java.util.Arrays.toString(add(arr, target)));
        
      }
      public static int[] add(int[] arr, int target){
           for(int i = 0; i < arr.length; i++){
                if(arr[i] + arr[i + 1] == target){
                    return new int[] {i, i +1};           
                    }
            }
            return new int[] {-1, -1}; // Return -1 if no such pair is found
    }
}
