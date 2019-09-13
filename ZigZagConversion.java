class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=0)
            return null;
        if(s==null || s.equals(""))
            return s;
        if(numRows == 1)
            return s;
        String[] str = new String[numRows];
        for(int i = 0; i<numRows; i++)
            str[i] = "";
        boolean goingDown = false;
        int curRow = -1;
        for(int i = 0; i<s.length();i++)
        {
            
            if(i == 0 || goingDown)
            {   curRow++;
             System.out.println(curRow);
                str[curRow] = str[curRow] + s.charAt(i);
                
            }
            else
            {   curRow--;
              System.out.println(curRow);
                str[curRow] = str[curRow] + s.charAt(i);
            }
            if(curRow == 0 || curRow == numRows - 1)
                goingDown = !goingDown;
        }
        String ans ="";
        for(int i = 0; i<numRows; i++)
        {
            ans = ans + str[i];
        }
        return ans;
    }
}
