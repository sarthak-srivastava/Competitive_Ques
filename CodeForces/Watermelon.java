import java.util.*;
public class Watermelon
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w>=1 && w<=100 && w!=2)
        System.out.println(w%2==0?"YES":"NO");
        else
        System.out.println("NO");
    }
}