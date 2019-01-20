import java.util.*;
class StackInvert{
    public static void main(String[] args)
    {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        Stack<Integer> helper = new Stack<Integer>();
        Invert(stk,helper);
        while(helper.size() > 0)
        stk.push(helper.pop());
        while(stk.size()>0)
        {System.out.print(stk.pop()+" ");}
    }
    public static void Invert(Stack<Integer> stk, Stack<Integer> helper)
    {   if(stk.size() == 0)
        return;
        int temp = stk.pop();
        Invert(stk,helper);

        helper.push(temp);
    }
}