package codeforces_general;

/* Prolem Link: https://codeforces.com/contest/1433/problem/B */
import java.util.*;

public final class cf_1433B
{
    static Scanner sc = new Scanner(System.in);
    
    static int solve() {
        
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        int count=0;
        
        int k=0; 
        while(k<n && arr[k]==0) k++;
        
        for(int i=k; i<n; i++) {
            if(arr[i] == 1) {
                if(count != 0)
                    al.add(count);
                count=0;
            }
            else {
                count++;
            }
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int x: al) {
            sum+=x;
            max = Math.max(max, x);
        }
        
        /*
        System.out.println("ArrayList: ");
        for(int x: al) System.out.printf("%d ", x);
        System.out.printf("\n");
        */
        
        if(al.size()==0) return 0;
        if(al.size()==1) return sum;
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int tc = sc.nextInt();
		while(tc-- > 0) {
		    System.out.println(solve());
		}
	}
}