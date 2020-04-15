class Solution {
    public String addBinary(String A, String B) {
         StringBuffer sb = new StringBuffer();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while(i>=0 && j>=0)
        {
            int a = A.charAt(i) - '0';
            int b = B.charAt(j) - '0';
            int sum = (carry + a + b) % 2;
            carry = (carry + a + b)/2;
            sb.insert(0, (char)(sum + '0'));
            i--;
            j--;
        }
        while(i>=0)
        {
            int a = A.charAt(i) - '0';
            // int b = B.charAt(j) - '0';
            int sum = (carry + a ) % 2;
            carry = (carry + a )/2;
            sb.insert(0, (char)(sum + '0'));
            i--;
        }
        while( j>=0)
        {
            // int a = A.charAt(i) - '0';
            int b = B.charAt(j) - '0';
            int sum = (carry  + b) % 2;
            carry = (carry  + b)/2;
            sb.insert(0, (char)(sum + '0'));
            j--;
        }
        if(carry > 0 )
        sb.insert(0, '1');
        return new String(sb);
    }
}
