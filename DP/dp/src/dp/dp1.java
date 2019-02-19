package dp;

public class dp1 {
	public static void main(String[] args) {
		int n = 100;
		long start = System.currentTimeMillis();
		System.out.println(Fib(n));
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		start = System.currentTimeMillis();
		System.out.println(Fibm(n, new int[n + 1]));
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static int Fib(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return Fib(n - 1) + Fib(n - 2);
	}

	public static int Fibm(int n, int[] qb) {
		if (n == 0 || n == 1)
			return n;
		if (qb[n] != 0)
			return qb[n];
		else
			return qb[n] = Fibm(n - 1, qb) + Fibm(n - 2, qb);
	}
}
