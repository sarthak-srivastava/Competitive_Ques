public class Solution {
	public int numSetBits(long a) {
	    int count = 0;
	    for(int i = 1 ; i<=32; i++)
	    {
	        if((a&(1<<i)) >0)
	        count++;
	    }
	    return count;
	}
}
