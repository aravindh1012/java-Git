import java.util.ArrayList;

public class GoogleCycleSort {
     public static void main(String[] args) {
        // In cycle sort check the first index and move to correct index and swap it and repeat the process.
        int[] arr = {4,3,2,7,8,2,3,1};
        missingNum(arr);  
        
       
        }
        static void missingNum(int[] arr){
            
            int i = 0;
                while(i < arr.length){
                 int correctIndex = arr[i] - 1;  //take the value as index ex: index arr[0] is value is 3
                if(arr[i] < arr.length && arr[i]!= arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }else{
                    i++;
                }

             }
            ArrayList<Integer> list = new ArrayList<>();
             for(int index = 0; index < arr.length; index++){
                if(arr[index] != index + 1){
                    list.add(index + 1);
                }
             }
             System.out.println(list);
             
           
        }
}
