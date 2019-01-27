import java.util.*;
class atoi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printAtoi(str);
    }
    public static void printAtoi(String str)
    {   int i = 0;
        int num = 0;
        while(str.charAt(i)==' ')
        i++;
        int sign = 1;
        if(str.charAt(i) == '-')
        {sign = -1;
            i++;
        }
        while(i<str.length())
        {   if(str.charAt(i)>'9' || str.charAt(i)<'0')
            {
                System.out.println("Invalid Input");
            }
            num = num*10 +(str.charAt(i) - '0');
            i++;
            if(Integer.MAX_VALUE/10<num)
            System.exit(0);
        }
        System.out.println(sign*num);
    }
}