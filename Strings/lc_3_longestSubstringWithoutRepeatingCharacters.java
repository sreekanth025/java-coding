package Strings;
import java.util.*; 

/* Problem link: https://leetcode.com/problems/longest-substring-without-repeating-characters/ */

class lc_3_longestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length(); 
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        
        int result = 0;
        int i=0; // 1 + index of latest repeated character;
        
        for(int j=0; j<n; j++) {
            
            i = Math.max(i, lastIndex[s.charAt(j)]+1);
            result = Math.max(result, j-i+1);
            
            lastIndex[s.charAt(j)] = j;
        }
        
        return result;
        
    }
}