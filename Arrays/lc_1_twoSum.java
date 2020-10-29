package Arrays;
/* Problem Link: https://leetcode.com/problems/two-sum/ */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int[][] arr = new int[n][2];
        
        for(int i=0; i<n; i++) {
            
            int[] tmp = new int[2];
            tmp[0] = nums[i];
            tmp[1] = i; 
            
            arr[i] = tmp;
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            
            public int compare(int[] a, int[] b) {
                return a[0]-b[0]; 
            }
        });
        
        int left = 0;
        int right = n-1; 
        
        while(left < right) {
            
            int sum = arr[left][0] + arr[right][0]; 
            
            if(sum == target) {
                int[] result = new int[2]; 
                result[0] = arr[left][1]; 
                result[1] = arr[right][1]; 
                
                return result;
            }
            
            else if(sum < target) left++;
            else right--; 
        }
        
        int[] res = new int[2]; 
        res[0]=-1; res[1]=-1;
        return res;
    }
}