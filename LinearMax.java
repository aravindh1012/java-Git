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
           //return maximum value of the array.
            return max;
        }
    }
    
