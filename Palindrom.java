public class Palindrom {
    public static void main(String[] arge){
        String s = "madam";
       

    }
      public static boolean isPalindrom(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
}
}
