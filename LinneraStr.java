public class LinneraStr {
    public static void main(String[] args) {
        String name = "Aravindh";
        char target = 'A';
        System.out.println(linearfind(name, target));
    }

      static boolean linearfind(String str, char target){
        if(str.length() == 0){
            return false;

        }
        // check the first 6 characters of the string and we can also use the substring method to check the firstIndex to endIndex characters of the string.
        // for(int i = 0; i < str.length(); i++){
        //     if(target == str.substring(0, 6).charAt(i)){
        //         return true;
        //     }
        //}


        // check the characters is there in the string or not.
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
        

    }

}
