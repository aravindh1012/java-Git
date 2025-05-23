

public class NextLeetCycle {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 2};
        duplicateNumber(arr);
         int ans = duplicateNumber(arr);
        System.out.println(ans);   
        
    }

    //-------------------------------------------------------------------------------
    // my problem skill..
    // static int duplicateNumber(int[] arr){
    //        int i = 0;
    //        while(i < arr.length){
    //             int correct = arr[i] -1;
    //             if( arr[i] != arr[correct]){
    //                 int temp = arr[i];
    //                 arr[i] = arr[correct];
    //                 arr[correct] = temp;
    //             }else{
    //                 i++;
    //             }
    //        }
    //        for(int index = 0; index < arr.length; index++){
    //         if(arr[index] != index + 1){
    //             return arr[index];
    //         }
    //        }
    //        return -1;   
    // }
    //----------------------------------------------------------------------------

    static int duplicateNumber(int[] arr){
         int i = 0;
            while(i < arr.length){
                if(arr[i] != i+1){
                    int correct = arr[i]- 1;
                    if(arr[i] != arr[correct]){
                        int temp = arr[i];
                        arr[i] = arr[correct];
                        arr[correct] = temp;
                    }else{
                        return arr[i];
                    }
                    }else{
                        i++;
                    
                }
            }
            return -1;
    }
}
