class Solution {
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0)
            return ans;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9, "wxyz"); 
        StringBuilder sb = new StringBuilder("");
        letterCombinations(digits, 0, sb, ans,map);
        return ans;
    }
    public void letterCombinations(String digits, int ind, StringBuilder curr, List<String> ans, HashMap<Integer, String> map)
    {
        if(ind >= digits.length())
        {
            ans.add(new String(curr));
            return;
        }
        for(char ch: map.get(digits.charAt(ind) - '0').toCharArray())
        {
            curr.append(ch);
            letterCombinations(digits, ind + 1, curr, ans, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
