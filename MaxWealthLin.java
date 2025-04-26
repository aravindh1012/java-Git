public class MaxWealthLin {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,6},
            {2,1,5},
            {2,4,7}
        };
       int total = maximumWealth(arr);
       System.out.println(total);
    }


    public static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for(int per = 0; per < accounts.length; per++){
            int sum = 0;
            for(int num=0; num<accounts[per].length; num++){
                sum += accounts[per][num];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
