package dp;

public class dp1 {
public static void main(String[] args)
{
	int n = 10;
	long start = System.currentTimeMillis();
	System.out.println(Fib(100));
	long end = System.currentTimeMillis();
	System.out.println(end-start);
	}
public static int Fib(int n)
{
	if(n == 0 || n == 1)
		return 1;
	else
		return Fib(n-1)+Fib(n-2);
}
}
