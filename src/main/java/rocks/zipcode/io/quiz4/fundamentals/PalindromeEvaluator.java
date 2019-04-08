package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] subStrings = StringEvaluator.getAllSubstrings(string);
        Set<String> allPalindroes = new HashSet<>();
        for (String s : subStrings
             ) {
            if(isPalindrome(s)){
                allPalindroes.add(s);
            }
        }
        String[] all = new String[allPalindroes.size()];
        return allPalindroes.toArray(all);
    }

    public static Boolean isPalindrome(String string) {
        if(string.equals(reverseString(string))){
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        String s = sb.reverse().toString();
        return s;
    }
}
