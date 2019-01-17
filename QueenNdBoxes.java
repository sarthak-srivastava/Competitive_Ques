import java.util.*;
class QueenNdBoxes{
    public static void main(String[] args)
    {   Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the total number of Queens:");
        int tq = sc.nextInt();
        System.out.println("Enter the total number of boxes");
        int m = sc.nextInt();
        PrintQueenPermutations(new boolean[m], tq, 0, "");
    }
    static int counter = 0;
    public static void PrintQueenPermutations(boolean[] boxes, int tq, int qpsf, String asf)
    {   if(tq>boxes.length)
        {
            System.out.println("No Arrangement Possible! Number of boxes less than the number of queens");
            return;
        }
        if(qpsf == tq)
        {
            counter++;
            System.out.println(counter + ". " +asf);
            return;
        }
        for(int b = 0; b<boxes.length; b++)
        {   if(boxes[b] == false)
            {
                boxes[b] = true;
            PrintQueenPermutations(boxes, tq, qpsf+1 , asf + "q"+(qpsf+1)+"b"+b+" " );
            boxes[b] = false;
        }
    }

    }
}