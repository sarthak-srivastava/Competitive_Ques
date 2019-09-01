class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return new ArrayList<String>();
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        List<String> ans = new ArrayList<String>();
        String curr = "";
        letterComboUtil(digits,hm,ans,curr,0);
        return ans;
    }
    public void letterComboUtil(String digits, HashMap<Integer,String> hm, List<String> ans, String curr, int pos)
    {   if(curr.length() == digits.length())
        {
            ans.add(curr);
            return;
                    }
        if(pos>=digits.length())
            return;
        String com = hm.get(digits.charAt(pos) - '0');
        for(int i = 0; i<com.length();i++)
        {
            curr = curr+ com.charAt(i);
            letterComboUtil(digits,hm,ans,curr,pos+1);
            curr = curr.substring(0,curr.length()-1);
        }
    }
}
