class Solution {
    public String multiply(String num1, String num2) {
        int[] num = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i>=0;i--)
        {
            for(int j = num2.length() - 1; j>=0;j--)
            {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + num[i+j+1];
                num[i + j] += sum/10;
                num[i+j+1] = sum%10;
            }
        }
        String ans = "";
        for(int i : num)
        {
            if(ans.length() == 0 && i == 0)
                continue;
            ans = ans + i;
        }
        if(ans.length() == 0)
            return "0";
        return ans;
    }
}
