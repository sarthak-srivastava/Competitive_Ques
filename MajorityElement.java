public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int can = A.get(0);
        int count = 1;
        for(int i = 1;i<A.size();i++)
        {
            if(A.get(i)==can)
            count++;
            else if (count==0)
            {
                can = A.get(i);
                count++;
            }
            else
            count--;
        }
        int c = 0;
        for(int i = 0; i<A.size();i++)
        {
            if(A.get(i) == can)
            c++;
        }
        if(c>Math.floor(A.size()/2))
        return can;
        return -1;
    }
}
