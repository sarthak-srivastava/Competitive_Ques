public class Solution {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>= 0)
        {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(j);
            if(ch1 == '1' && ch2 == '1')
            {   if(carry == 0){
                sb.insert(0,"0");
                carry = 1;}
                else
                sb.insert(0,"1");
            }
            else if(ch1 == '0' && ch2 =='0')
            {
                if(carry == 1){
                    sb.insert(0,"1");
                    carry = 0;
                }
                else
                    sb.insert(0,"0");
            }
            else
            {
                if(carry == 1)
                {
                    sb.insert(0,"0");
                }
                else
                    sb.insert(0,"1");
            }
            i--;
            j--;
        }
        while(i>=0)
        {
            char ch = a.charAt(i);
            if(ch == '0' && carry>0){
            sb.insert(0,"1");
            carry = 0;
            }
            else if(ch == '1' && carry > 0)
            {
                sb.insert(0,"0");
            }
            else
            {
                sb.insert(0,ch);
            }
            i--;
        }
        while(j>=0)
        {
            char ch = b.charAt(j);
            if(ch == '0' && carry>0){
            sb.insert(0,"1");
            carry = 0;
            }
            else if(ch == '1' && carry > 0)
            {
                sb.insert(0,"0");
            }
            else
            {
                sb.insert(0,ch);
            }
            j--;
        }
        if(carry>0)
        sb.insert(0,"1");
        return new String(sb);
    }
}
