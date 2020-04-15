public class Solution {
    public String multiple(int A) {
        if(A == 0 || A == 1)
            return Integer.toString(A);
            
        return multiple(Integer.toString(A),Integer.toString(A));
    }
    public String multiple(String A, String orig)
    {
        for(char ch: A.toCharArray())
        {
            if(ch != '1' && ch!= '0')
                {
                    return multiple(Add(A, orig), orig);
                }
        }
        return A;
    }
    public String Add(String A, String B)
    {
        StringBuffer sb = new StringBuffer();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while(i>=0 && j>=0)
        {
            int a = A.charAt(i) - '0';
            int b = B.charAt(j) - '0';
            int sum = (carry + a + b) % 10;
            carry = (carry + a + b)/10;
            sb.insert(0, (char)(sum + '0'));
            i--;
            j--;
        }
        while(i>=0)
        {
            int a = A.charAt(i) - '0';
            // int b = B.charAt(j) - '0';
            int sum = (carry + a ) % 10;
            carry = (carry + a )/10;
            sb.insert(0, (char)(sum + '0'));
            i--;
        }
        while( j>=0)
        {
            // int a = A.charAt(i) - '0';
            int b = B.charAt(j) - '0';
            int sum = (carry  + b) % 10;
            carry = (carry  + b)/10;
            sb.insert(0, (char)(sum + '0'));
            j--;
        }
        if(carry > 0 )
        sb.insert(0, '1');
        return new String(sb);
        
        
    }
}
