import java.util.*;
public class Tiles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long a = sc.nextLong();
        System.out.println((long)(Math.ceil((double)m/(double)a)*Math.ceil(((double)n/(double)a))));

    }
}