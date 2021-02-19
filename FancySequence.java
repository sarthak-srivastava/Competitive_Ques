class Fancy {
    int[] hm;
    int n;
    int track;
    long[] mul; 
    int[] add;
    int[] range;
    public Fancy() {
        hm  = new int[100000];
        range = new int[100000];
        n = 0;
        mul  = new long[100000];
        add  = new int[100000];
        track =  0;
    }
    
    public void append(int val) {
        hm[n] = val;
        range[n] = track;
        n += 1;
    }
    
    public void addAll(int inc) {
        add[track] = inc;
        mul[track++] = 1;
    }
    
    public void multAll(int m) {
        mul[track++] = m;
    }
    
    public int getIndex(int idx) {
        if(idx < n)
        {  int ans = hm[idx];
         
            for(int i = range[idx]; i<track; i++)
            {   
                    ans = (int)((ans * mul[i] + add[i])%1000000007);
            }
            return ans;}
        return -1;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
