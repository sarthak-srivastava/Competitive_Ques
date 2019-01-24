/* Given three prime number(p1, p2, p3) and an integer k. Find the first(smallest) k integers which have only p1, p2, p3 or a combination of them as their prime factors.

Example:

Input : 
Prime numbers : [2,3,5] 
k : 5

If primes are given as p1=2, p2=3 and p3=5 and k is given as 5, then the sequence of first 5 integers will be: 

Output: 
{2,3,4,5,6}

Explanation : 
4 = p1 * p1 ( 2 * 2 )
6 = p1 * p2 ( 2 * 3 )

Note: The sequence should be sorted in ascending order */
import java.util.*;
class SequenceWithPrimes{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(a);
        set.add(b);
        set.add(c);
        for(int i = 0; i<n;i++)
        {   int temp = set.first();
            ans.add(temp);
            set.remove(temp);
            set.add(temp*a);
            set.add(temp*b);
            set.add(temp*c);
        }
        System.out.println(ans);
    }
}