 import java.util.Arrays;
public class LeetcodeCyclesort {  
  public static void main(String[] args) {
        // In cycle sort check the first index and move to correct index and swap it and repeat the process.
        int[] arr = {4,0,2, 1};
        missingNum(arr);  
        System.out.println(missingNum(arr));
       
        }
        static int missingNum(int[] arr){
            
            int i = 0;
                while(i < arr.length){
                 int correctIndex = arr[i];  //take the value as index ex: index arr[0] is value is 3
                if(arr[i] < arr.length && arr[i]!= arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }else{
                    i++;
                }

             }
             for(int index = 0; index < arr.length; index++){
                if(arr[index] != index){
                    return index;
                }
             }
             return arr.length;

        }
}


