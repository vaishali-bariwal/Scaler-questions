import java.util.*;

class Solution{

    static boolean isoMorphic(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();

        if (n != m)
            return false;
 
        int[] countChars1 = new int[26];
        int[] countChars2 = new int[26];
 
        for (int i = 0; i < n; i++) {
            countChars1[str1.charAt(i) - 'a']++;
            countChars2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (countChars1[str1.charAt(i) - 'a']
                != countChars2[str2.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        System.out.println(
            isoMorphic("abb", "xxy") ? "True" : "False");
    }
}