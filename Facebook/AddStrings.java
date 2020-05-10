class Solution {
    public String addStrings(String num1, String num2) {
     if(num1.length() == 0)
         return num2;
     if(num2.length() == 0)
         return num1;
     int carry = 0;
     int sum = 0;
    StringBuilder sb = new StringBuilder();
    int i = num1.length() - 1;
    int j = num2.length() - 1;
        while(i >=0 && j >=0)
        {
            sum = (num1.charAt(i--) -'0') +(num2.charAt(j--) -'0') + carry;
            carry = sum / 10;
            sum = sum%10;
            sb.insert(0,Integer.toString(sum));
            
        }
        while(i >=0 )
        {
            sum = (num1.charAt(i--) -'0') + carry;
            carry = sum / 10;
            sum = sum%10;
            sb.insert(0,Integer.toString(sum));
            
        }
        while(j >=0)
        {
            sum = (num2.charAt(j--) -'0') + carry;
            carry = sum / 10;
            sum = sum%10;
            sb.insert(0,Integer.toString(sum));
            
        }
        if(carry > 0)
            sb.insert(0, Integer.toString(carry));
        return new String(sb);
    }
}
