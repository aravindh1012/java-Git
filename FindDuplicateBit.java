public class FindDuplicateBit {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,2,3,6};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr){
    int unique = 0;
    for(int n : arr){
        unique = unique ^ n;  //any number xor with 0 it will return the number itself
        // if the number is repeated it will cancel out itself
    }
    return unique;
}
}
