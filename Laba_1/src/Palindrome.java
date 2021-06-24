// class Palindrome {
//    public static void main(String[] args){
//        for(int i = 0; i< args.length; i++){
//            String s = args[i];
//        }
//   }
//}
class Palindrome {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("топот");
        System.out.println(s);
        StringBuffer s1 = s.reverse();
        System.out.println(s1);

        if(s.toString().equals(s1.toString())){
            System.out.println("слово является палиндромом");
        }
        else {
            System.out.println("слово не является палиндромом");
        }
    }
}

