public class LinearMinMax {
    public static void main(String[] args) {
        int[] Mylist = {2, 4, 7, 87, 45, 30, 47};
        System.out.print(min(Mylist));
    }
    public static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length;i++){
            int min = arr[0];
            if(arr[i] <= min){
                min = arr[i];
                return min;

            }
        }
        //this line will executed if none of the return statement above have executed.
        //hence the target not found.
        return -1;
    }
}
