package codechef_general;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class cc_39167023
{
    static Scanner sc = new Scanner(System.in); 
    
    static String solve() {
        
        int n = sc.nextInt();
        String str = sc.next();
        
        
        for(int i=0; i<n-1; i++) {
            if(str.charAt(i) == str.charAt(n-1))
                return "YES";
        }
        
        return "NO";
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int tc = sc.nextInt();
		
		while(tc-- > 0) {
		    System.out.println(solve()); 
		}
	}
}
