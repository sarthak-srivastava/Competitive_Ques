// 3 pointer. i -> distinct character, j -> duplicate count, k -> answer editor
//  
class Solution {
    public int compress(char[] chars) {
        if(chars == null || chars.length == 0)
            return 0;
        if(chars.length==1)
            return 1;
        int i = 0;
        int j = 0;
        int k = -1;
        int ans = 0;
        while(i < chars.length && j < chars.length)
        {   
            if(chars[i] == chars[j])
            {
                j++;
            }
            else
            {   chars[++k] = chars[i];
                if(j>i+1)
                {  String freq = Integer.toString(j - i);
                 // System.out.println(freq);
                 int temp = 0; 
                 for(char ch:freq.toCharArray())
                  {   
                      chars[++k] = ch;
                     temp++;
                  }
                    ans += temp + 1;
                }
                else
                    ans += 1;
                i = j;
                j++;
             }
        }
        if(i<chars.length)
        {   chars[++k] = chars[i];
            if(j>i+1)
                {   String freq = Integer.toString(j - i);
                 // System.out.println(freq);
                 int temp = 0; 
                 for(char ch:freq.toCharArray())
                  {   
                      chars[++k] = ch;
                     temp++;
                  }
                    ans += temp + 1;
                }
                else
                    ans += 1;

             
        }
        return ans;
    }
}
