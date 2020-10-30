package codeforces_general;

/* Problem Link: https://codeforces.com/contest/1433/problem/A */
import java.util.*;

public final class cf_1433A
{
    static Scanner sc = new Scanner(System.in); 
    
    static int solve() {
        
        int res=0; 
        String str = sc.next(); 
        
        int len = str.length(); 
        int n = str.charAt(0)  - '0';
        
        res += 10*(n-1); 
        for(int i=1; i<=len; i++) {
            res += i;
        }
        
        return res;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int tc = sc.nextInt(); 
		while(tc-- >  0)  {
		    System.out.println(solve());
		}
	}
}