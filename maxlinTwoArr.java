
import java.util.Arrays;
public class maxlinTwoArr {
    public static void main(String[] args) {
        int[][] arr ={
                      {1,2,3,4,5},
                      {6,7,8,9,10},
                      {11,12,13,14},
                      {16,17,18,19}
                    };
        
        int[] result = Max(arr);
        System.out.println(Arrays.toString(result));

    }

    static int[] Max(int[][]arr){
//      maximum number in 2d array
        int max = arr[0][0];

        for(int row = 0; row < arr.length; row++){  // arr.length gives number of rows (in this case 4rows).
            for(int col = 0; col < arr[row].length; col++){   //arr[row].length gives number of elements in the current row.
                if(arr[row][col] >= max){
                    max = arr[row][col];
                    
                }
            }
        }
        return new int[]{max}; // return -1 if not found
    }
}

    

