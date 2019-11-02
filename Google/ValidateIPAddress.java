class Solution {
    public String validIPAddress(String IP) {
        String[] values = IP.split("\\.");
        // System.out.println(values.length);

        // String ans = "Neither";
        if(values.length == 4)
        {   String ans = "IPv4";
            for(int i = 0; i<values.length;i++)
            {
                String curr = values[i];
                // System.out.println(curr);

                if(curr.length() == 0 || (curr.charAt(0) == '0' && curr.length()>1))
                    return "Neither";
                int int_val = 0;
                for(int j = 0;j<curr.length();j++)
                {
                    char ch = curr.charAt(j);
                    if(ch>='0' && ch<='9')
                    {
                        int_val = int_val*10 + (ch - '0');
                    }
                    else
                    return "Neither";
                }
                
                 // int int_val = Integer.parseInt(curr);
                 if(int_val<0 || int_val>255)
                    return "Neither";
                // System.out.println(int_val);
               
            }
         if(IP.charAt(IP.length()-1)!='.')
         return ans;
        }
        values = IP.split(":");
        if(values.length == 8)
        {
            for(int i = 0; i<values.length;i++)
            {
                String curr = values[i];
                if(curr.length()>4||curr.length()<1)
                    return "Neither";
                for(int j = 0; j<curr.length();j++)
                {
                    char ch = curr.charAt(j);
                    if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='f')||(ch>='A'&&ch<='F'))
                       continue;
                    return "Neither";
                }
            }
            if(IP.charAt(IP.length()-1)!=':')
             return "IPv6";  
        }
        return "Neither";
    }
}
