public class EvendigLinear {
    public static void main(String[] args) {
     int[] arr = {12, 4, 44, 3467, 4566};
    // even(arr);
    System.out.println(EvenDigit(arr));

}
    //  how many of them contains even number of digits
      static int EvenDigit(int[] arr){

              int count = 0;
              for (int i = 0; i< arr.length; i++){
                        if (even(arr[i])){
                                count++;
                        }   
              }
              return count;
     }
          // this is another method for find digits. It is time complexity much better than NumDigits. 
//       static int NumDigits2(int num){
//                if (num < 0){
//                 num = num * -1;
//                }
//                return (int)(Math.log10(num)) + 1;  

//       }
     //how many digits in a number
     static int NumDigits(int num){
             int count = 0;
             while(num!= 0){
                    num /= 10;
                    count++;
             }
                return count;
     }

     // check if the number of digits is even or not
     static boolean even(int num){
            int MyNum = NumDigits(num);
            // if(MyNum %2 == 0){
            //     return true;
            // }
            // return false;
            return MyNum % 2 == 0;  // another easy method for return statement.8il
     }
     
}