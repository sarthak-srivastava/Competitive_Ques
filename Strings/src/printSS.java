public class printSS {
    public static void main(String[] args)
    {
        String s=  "abc";
        for(int i = 0; i<(1<<s.length());i++)
        {
            for(int j = s.length()-1;j>=0;j--)
            {
                int mask = 1 << j;
                if((i & mask == (int)1 ))
                {
                    System.out.print(s.charAt(s.length()-1-j));
                }
            }
            System.out.println();
        }
    }
}