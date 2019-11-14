class Solution {
    public String alphabetBoardPath(String target) {
        if(target == null || target.length() == 0)
            return "";
        char[][] board = new char[6][];
        board[0] = new char[]{'a','b','c','d','e'};
        board[1] = new char[]{'f','g','h','i','j'};
        board[2] = new char[]{'k','l','m','n','o'};
        board[3] = new char[]{'p','q','r','s','t'};
        board[4] = new char[]{'u','v','w','x','y'};
        board[5] = new char[]{'z'};
        
        HashMap<Character,point> hm = new HashMap<>();
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[i].length; j++)
            {
                hm.put(board[i][j],new point(i,j));
            }
        }
        
        StringBuilder ans = new StringBuilder("");
        point curr = new point(0,0);
        for(int i = 0; i<target.length();i++)
        {
            char ch = target.charAt(i);
            type(ch,hm,curr,ans);
        }
        return ans.toString();
        
        
    }
    public void type(Character ch,HashMap<Character,point> hm, point curr, StringBuilder ans)
    {
        int r = hm.get(ch).r;
        int c = hm.get(ch).c;
        if(r == 5 && c == 0){
              while(curr.c > c)
        {curr.c--;
        ans.append('L');
        }
            while(curr.c < c)
        {curr.c++;
        ans.append('R');
        }
            while(curr.r < r)
        {curr.r++;
        ans.append('D');
        }
          while(curr.r > r)
        {curr.r--;
        ans.append('U');
        }
      
        ans.append('!');}
        else
        {while(curr.r < r)
        {curr.r++;
        ans.append('D');
        }
          while(curr.r > r)
        {curr.r--;
        ans.append('U');
        }
            while(curr.c > c)
        {curr.c--;
        ans.append('L');
        }
            while(curr.c < c)
        {curr.c++;
        ans.append('R');
        }
        ans.append('!');}
    }
    public class point
    {
        // char ch;
        int r;
        int c;
        public point(int R, int Col)
        {
            // ch = C;
            r = R;
            c = Col;
        }
    }
}
