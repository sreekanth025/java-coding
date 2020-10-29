/* Problem Link: https://www.codechef.com/APO12020/problems/APOC2_03 */
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		int k = sc.nextInt(); 
		
		int[] arr = new int[n]; 
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		sc.close();
			
// 		System.out.println(n); 
// 		System.out.println(k);
// 		for(int i=0; i<n; i++) {
// 		    System.out.printf("%d ", arr[i]);
// 		}

        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        
        for(int i=0; i<n-k; i++) {
            ans = Math.min(ans, arr[i+k-1]-arr[i]);
        }
	    
	    System.out.println(ans);	
	}
}
