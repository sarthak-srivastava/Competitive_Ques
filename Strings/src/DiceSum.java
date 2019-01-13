import java.util.*;
class DiceSum{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dice: ");
        int n = sc.nextInt();
        System.out.println("Enter the total sum desired:");
        System.out.println("Possible permutations giving the desired sum : ");
        int sum_desired = sc.nextInt();
        DiceSum(n,sum_desired);
    }
    public static void DiceSum(int n, int sum_desired)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        DiceSumHelper(n,res,sum_desired);
    }
    public static void DiceSumHelper(int n,ArrayList<Integer> res, int sum_desired)
    {
        if(n==0)
        {   if(sum_desired==0){
            System.out.print("( ");
            for(int i= 0; i<res.size();i++)
            System.out.print(res.get(i)+" ");
            System.out.println(")");
        }
        }
        else
        {   if(!((n*6<sum_desired)||(n>sum_desired)))
        {
            for(int i = 1 ; i<=6; i++)
            {res.add(i);
             DiceSumHelper(n-1,res,sum_desired-i);
             res.remove(res.size()-1);   }
        }
        }
    }
}