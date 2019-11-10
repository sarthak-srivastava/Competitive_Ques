class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        try{
            while(sum!=1)
            {   
                if(n == 0)
                {
                    if(hs.contains(sum))
                        return false;
                    hs.add(sum);
                    n = sum;
                    sum = 0;
            }
                while(n!=0){
                sum += (n%10) *(n%10);
                n = n/10;}
            }
            
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
