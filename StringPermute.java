import java.util.*;
class StringPermute{
    public static void main(String[] args)
    {
        String ques = "abc";
        printPermute(ques,"");

    }
    public static void printPermute(String ques, String asf)
    {   if(ques.length() == 0)
        {
            System.out.print(asf +" ");
            return;
        }
        for(int i = 0;i < ques.length();i++)
        {   String left = ques.substring(0,i);
            String right = ques.substring(i+1);
            String roq = left+right;
            char ch = ques.charAt(i);
            printPermute(roq, asf+ch); 
    }
}
}