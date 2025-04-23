public class LinearMax {
        public static void main(String[] args) {
            int[] Mylist = {9, 4, 7, 87, 45, 30, 47};
            System.out.print(min(Mylist));
        }
        public static int min(int[] arr){
            int max = arr[0];
            for(int i = 0; i<arr.length;i++){
                
                if(arr[i] >= max){
                    max = arr[i];
                   
    
                }
            }
            //this line will executed if none of the return statement above have executed.
            //hence the target not found.
            return max;
        }
    }
    
