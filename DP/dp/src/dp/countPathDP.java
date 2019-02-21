class countPathDP
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        System.out.println("Total ways to move from 0 to 10 is(via simple recursion): " + cbp(0,10));
        long end = System.currentTimeMillis();
        System.out.println("Total time taken by this approach is:"+(end-start)+"ms");

        start = System.currentTimeMillis();
        System.out.println("Total ways to move from 0 to 10 is(via memoization): " + cbpmemo(0,10,new int[11][11]));
        end = System.currentTimeMillis();
        System.out.println("Total time taken by this approach is:"+(end-start)+"ms");

        start = System.currentTimeMillis();
        System.out.println("Total ways to move from 0 to 10 is(via tabulation): " + cbptab(0,10));
        end = System.currentTimeMillis();
        System.out.println("Total time taken by this approach is:"+(end-start)+"ms");
    }
    public static int cbp(int s, int d)
    {   if(s>d)
        return 0;
        if(s==d)
        return 1;

        int cstod = 0;
        for(int dice = 1;dice<=6;dice++)
        {
            int i = s + dice;
            int citod = cbp(i,d);
            cstod += citod;
        }
        return cstod;
        }
        public static int cbpmemo(int s, int d,int[][] qb)
        {   if(s>d)
            return 0;
            if(s==d)
            return 1;
            if(qb[s][d]!=0)
            return qb[s][d];
    
            int cstod = 0;
            for(int dice = 1;dice<=6;dice++)
            {
                int i = s + dice;
                int citod = cbpmemo(i,d,qb);
                cstod += citod;
            }
            return qb[s][d] = cstod;
            }
            public static int cbptab(int s, int d)
        {   int[] qb = new int[d+1];
            if(s>d)
            return 0;
            if(s==d)
            return 1;
            qb[d] = 1;
            int cstod = 0;
            for(int j = d-1;j>=s;j--){
            for(int dice = 1;dice<=6;dice++)
            {
                int i = j + dice;
                if(i<=d){
                qb[j] +=qb[i];

            }
        }

            
            }
            return qb[s];
        }
}