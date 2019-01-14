import java.util.*;
class DicePermute {
    static long c = 0;
    public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int h = sc.nextInt();
    DiceRoll(l,h,0,l,new ArrayList<Integer>()) ;   
    System.out.println(c);
}
public static void DiceRoll(int l, int h, int n, int curr_sum, ArrayList<Integer> chosen)
{
    if(curr_sum == h && n<=h)
    {    System.out.print("(");
        for(int i = 0; i<chosen.size();i++)
        {
            System.out.print( chosen.get(i)+" ");
        }
       System.out.println(")");
       c++;
    }
    if(curr_sum<h)
    {   if(!(curr_sum+(h-n)*6<h && curr_sum+(h-n)*1>h))
       { for(int i = 1;i<7;i++)
        {
            chosen.add(i);
            DiceRoll(l,h,n+1,curr_sum+i,chosen);
            chosen.remove(chosen.size()-1);
        }
    }
}
}
}