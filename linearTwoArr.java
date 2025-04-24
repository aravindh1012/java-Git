import java.util.Arrays;

public class linearTwoArr {
    public static void main(String[] args) {
        int[][] arr ={
                      {1,2,3,4,5},
                      {6,7,8,9,10},
                      {11,12,13,14},
                      {16,17,18,19}
                    };
        int target = 14;
        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] search(int[][]arr, int target){
        for(int row = 0; row < arr.length; row++){  // arr.length gives number of rows (in this case 4rows).
            for(int col = 0; col < arr[row].length; col++){   //arr[row].length gives number of elements in the current row.
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1}; // return -1 if not found
    }
}
