package fondamentaux;

/*

Given a string s, return true if the s can be palindrome after deleting at most one character from it.
        Example 1:
            Input: s = "aba"
            Output: true
        Example 2:
            Input: s = "abca"
            Output: true
            Explanation: You could delete the character 'c'.
        Example 3:
            Input: s = "abc"
            Output: false
        Constraints:
            1 <= s.length <= 105
            s consists of lowercase English letters.
*/

/* deux solutions avec et sans recursivité*/

public class PalindromeII {
    public static void main(String[] args) {


        String s = "abcba"; //true
        String s1 = "abcdba"; // true en supprimant le d
        String s2 = "abc"; // false
        System.out.println(validPalindrome(s));
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));


    }
    static int count = 0;
    public static boolean validPalindrome(String s) {
            int l = 0;
            int r = s.length() - 1;

            return check(s, l, r);
    }

    private static  boolean check(String s, int l, int r) {

        if (l >= r) return true;

        if (s.charAt(l) != s.charAt(r)) {
            if (count >= 1) return false;
            else {
                count += 1;
                return check(s, l + 1, r) || check(s, l, r - 1);
            }
        } else {
            return check(s, l + 1, r - 1);
        }
    }
}

/*
public class PalindromeII {
    public static void main(String[] args) {

        String s = "abc";
        System.out.println(validPalindrome(s));


        }

    public static boolean validPalindrome(String s) {
        //StringBuilder  = new StringBuilder(s);
        int index =0; boolean palindrome =true;

        for (int i=0; i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                index = i;
                palindrome =false;
                break;
            }
        }

        if(!palindrome){
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(index);
            if(sb.toString().equals(sb.reverse().toString())){return true;}

            sb = new StringBuilder(s);
            sb.deleteCharAt(s.length()-1-index);
            if(sb.toString().equals(sb.reverse().toString())){return true;}
        }

        return palindrome;

    }

}
*/

