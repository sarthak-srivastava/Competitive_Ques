// Printing substring using Decision Tree Model for each character of the given input String

import java.util.*;
class SubsequenceTree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the objective String: ");
        String str = sc.next();
        printSS(str,"");
    }
    public static void printSS(String ques, String ans)
    {
        if(ques.length()==0){
        System.out.println(ans);
        return;
    }
    char ch = ques.charAt(0);
    String roq = ques.substring(1);
    printSS(roq, ans);
    printSS(roq,ans + ch );
    return;    
}
}