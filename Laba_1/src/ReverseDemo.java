class ReversDemo {
    public static String reverseString(String str){
        String result ="";
        for (int i = 0; i< str.length(); i++){
            result = str.charAt(i) + result;
        }
       return result;
    }

    public static boolean isPalindrome(String str){
            if ( str.equals(reverseString(str)) )
                return true;
            else {
                return false;
            }
    }

    public static void main(String[] args){
        String[] n_args = {"грохот", "потоп", "солнце"};
        for (String line:n_args){
            if (isPalindrome(line))
                System.out.println(line + " - слово является палиндомом");
            else {
                System.out.println(line + " - слово не является палиндромом");
            }

        }
    }
}

