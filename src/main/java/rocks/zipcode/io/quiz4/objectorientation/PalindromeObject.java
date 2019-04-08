package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    public String string;
    public PalindromeObject(String input) {
        this.string = input;
    }
    public String[] getAllPalindromes(){
        String[] subStrings = StringEvaluator.getAllSubstrings(string);
        Set<String> allPalindroes = new HashSet<>();
        for (String s : subStrings
        ) {
            if(new PalindromeObject(s).isPalindrome()){
                allPalindroes.add(s);
            }
        }
        String[] all = new String[allPalindroes.size()];
        return allPalindroes.toArray(all);
    }

    public Boolean isPalindrome(){
        if(string.equals(PalindromeObject.this.reverseString())){
            return true;
        }
        return false;
    }

    public String reverseString(){
        StringBuilder sb = new StringBuilder(string);
        String s = sb.reverse().toString();
        return s;
    }
}
