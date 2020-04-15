class Solution {
    public int numUniqueEmails(String[] emails) {
       if(emails == null || emails.length == 0)
           return 0;
        Set<String> hs = new HashSet<>();
        for(String email: emails)
        {
            StringBuffer sb = new StringBuffer();
            String[] split = email.split("@");
            for(int i = 0; i<split[0].length(); i++)
            {
                char ch = split[0].charAt(i);
                if(ch == '.')
                    continue;
                if(ch == '+')
                    break;
                sb.append(ch);
            }
            sb.append('@');
            sb.append(split[1]);
            
            String temp = new String(sb);
            if(!hs.contains(temp))
            hs.add(temp);
        }
        // for(String str:hs)
        //     System.out.print(str + " ");
        return hs.size();
    }
}
