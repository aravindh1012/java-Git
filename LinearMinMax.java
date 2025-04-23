public class LinearMinMax {
    public static void main(String[] args) {
        int[] Mylist = {7, 4, 7, 87, 45, 30, 1, 47};
        System.out.print(min(Mylist));
    }
    public static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
                

            }
        }
        //this line will executed if none of the return statement above have executed.
        //hence the target not found.
        return ans;
    }
}
