public class Solution {
    public int factorial(int n)
    {
        if(n<=2)
                return n;
        return n * factorial(n - 1)%1000003;
    }
    public int findRank(String A) {
        int rank = 1;

        for (int i = 0; i < A.length(); i++)
        {
            int count = 0;
            for (int j = i + 1; j < A.length(); j++)
            {
                if (A.charAt(i) > A.charAt(j))
                    count++;
            }
            rank += count * factorial(A.length() - i - 1)%1000003;
        }

        return rank%1000003;
    }
}
