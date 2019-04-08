package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();
        for(int i = 0; i<string.length();i++){
            for(int j=i+1; j<=string.length();j++){
                String sub = string.substring(i,j);
                list.add(sub);
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] array1 = getAllSubstrings(string1);
        String[] array2 = getAllSubstrings(string2);
        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < array1.length ; i++){
            for (int j = 0 ; j < array2.length ; j++){
                if (array1[i].equals(array2[j])){
                    list.add(array1[i]);
                }
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return Arrays.stream(getCommonSubstrings(string1, string2)).max(Comparator.comparing(String :: length)).get();
    }
}
