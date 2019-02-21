class countPathDP
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        System.out.println("Total ways to move from 0 to 10 is(via simple recursion: " + cbp(0,10));
        long end = System.currentTimeMillis();
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
}