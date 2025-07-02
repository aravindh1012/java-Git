public class RegLinear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 3;
        System.out.println(find(arr, target, 0)); // true
        System.out.println(findIndex(arr, target, 0)); // 2
    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

     static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]  == target){
            return index;
        }else{
        return  findIndex(arr, target, index + 1);
        }
    }
}
