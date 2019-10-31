public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int line = 0;line<=A;line++)
        {   ArrayList<Integer> temp  = new ArrayList<Integer>();
            
            for(int i = 0; i<=line;i++)
            {   
                if(i == 0 || i == line)
                temp.add(1);
                else
                temp.add(a.get(i-1) + a.get(i));
                
            }
            a = temp;
    
        }
    return a;
    }
    
}
