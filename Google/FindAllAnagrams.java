import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> ans = new ArrayList<Integer>();
        if(s == null || s.length() == 0 || p == null || p.length() == 0)
            return ans;
    int[] pat_map = new int[256];
    for(char ch: p.toCharArray())
    {
        pat_map[ch]++;
    }
    int i = 0;
        int start = -1;
        int count = 0;
        while(i<s.length())
    {
        char curr = s.charAt(i);
        if(pat_map[curr]>0)
        {   start = i;
            int k = i;
            count = 0;
            int[] copy_map = Arrays.copyOf(pat_map,pat_map.length);
            while(k<s.length() && copy_map[s.charAt(k)]>0)
            {
                copy_map[s.charAt(k)]--;
                k++;
                // count++;
            }
            int temp = 0;
         for(int j = 0; j<256;j++)
             temp += copy_map[j];
         if(temp == 0)
                ans.add(start);
     
        }
                   i++;
    }
        return ans;

    }
}
