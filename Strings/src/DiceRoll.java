import java.util.*;
class DiceRoll{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dice: ");
        int n = sc.nextInt();
        System.out.println("Possible outcomes are:  ");
        DiceRoll(n);
    }
    public static void DiceRoll(int n)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        DiceRollHelper(n,res);
    }
    public static void DiceRollHelper(int n,ArrayList<Integer> res)
    {
        if(n==0)
        {
            System.out.print("(");
            for(int i= 0; i<res.size();i++)
            System.out.print(res.get(i)+" ");
            System.out.println(")");
        }
        else
        {
            for(int i = 1 ; i<=6; i++)
            {res.add(i);
             DiceRollHelper(n-1,res);
             res.remove(res.size()-1);   }

        }
    }
}