import java.util.*;

/* Problem Link: https://codeforces.com/problemset/problem/281/A */
public final class cf_281A.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); 
		char[] str = sc.next().toCharArray(); 
        if('a' <= str[0] && str[0] <= 'z') {
            str[0] = (char) (str[0]-'a'+'A');
        }
        System.out.println(new String(str)); 
	}
}
