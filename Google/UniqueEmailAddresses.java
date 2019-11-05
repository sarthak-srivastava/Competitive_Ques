class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<String>();
        for(int i = 0;i<emails.length;i++)
        {
            String[] email_parts = emails[i].split("@");
            String filtered_local_name = "";
            for(int j = 0; j<email_parts[0].length();j++)
            {   char curr_ch = email_parts[0].charAt(j);
                if(curr_ch == '.')
                    continue;
                if(curr_ch == '+')
                    break;
                filtered_local_name  = filtered_local_name + curr_ch;
            }
            
            String final_filtered_email = filtered_local_name + '@' + email_parts[1];
            if(!hs.contains(final_filtered_email))
                hs.add(final_filtered_email);
            
        }
        return hs.size();
    }
}
