class MazeBoard{
    public static void main(String[] args)
    {
        
        printBoard(0,0,3,3,"");
    }
    static int c = 0;
    public static void printBoard(int sr, int sc, int dr, int dc, String psf)
    {
        if(sr == dr && sc == dc)
        {   c++;
            System.out.println(c+"."+psf);
            return;
        }
        for(int mr = 1; mr<=(dr - sr);mr++)
        {
            printBoard(sr+mr,sc,dr,dc,psf+'V'+mr);
        }
        
        for(int mc = 1; mc<=(dc - sc);mc++)
        {
            printBoard(sr,sc+mc,dr,dc,psf+'H'+mc);
        }
        
        for(int ma = 1; ma<=(dr - sr) && ma<=(dc - sc);ma++)
        {
            printBoard(sr+ma,sc+ma,dr,dc,psf+'D'+ma);
        }
        return;
    }
}