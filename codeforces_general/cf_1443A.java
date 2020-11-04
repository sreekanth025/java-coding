package codeforces_general;

/* Prolem Link: https://codeforces.com/contest/1443/problem/A */

import java.util.*;

public final class cf_1443A
{
    static Scanner sc = new Scanner(System.in);
    
    static void solve() {
        
        int n = sc.nextInt(); 
        for(int i=2*n+2; i<=4*n; i+=2) {
            System.out.printf("%d ", i); 
        }
        System.out.printf("\n");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int tc = sc.nextInt(); 
		
		while(tc-- > 0) {
		    solve();
		}
	}
}
