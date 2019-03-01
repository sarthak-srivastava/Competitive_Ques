class Solution {
    public int numUniqueEmails(String[] emails) {
        String ans = "";
        int count = 0;
        int i;
        HashSet<String> h = new HashSet<String>();
        for(int j = 0;j<emails.length;j++)
        {ans = "";

        for(i = 0;i<emails[j].length();i++)
        {
            if(emails[j].charAt(i) == '.')
                continue;
            if(emails[j].charAt(i) == '+')
                break;
            if(emails[j].charAt(i) == '@')
                break;
            ans = ans + emails[j].charAt(i);
        }
         while(emails[j].charAt(i)!='@')
             i++;
        ans = ans + emails[j].substring(i);
        if(!h.contains(ans))
        {h.add(ans);
         System.out.print(ans+" ");
         count++;
    }}
         return count;
        }
}
