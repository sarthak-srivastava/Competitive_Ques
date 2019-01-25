public class IdenticalBTree{
    private static class Node{
        int val;
        Node left;
        Node right;
    }
    public static void main(String[] args)
    {
        Node x = new Node();
        x.val = 1;
        Node t = new Node();
        t.val = 2;
        x.left = t;
        Node t1 = new Node();
        t1.val = 3;
        x.right = t1;
        Node y = new Node();
        y.val = 1;
        Node q = new Node();
        q.val = 2;
        y.left = q;
        Node q1 = new Node();
        q1.val = 3;
        y.right = q1;
        System.out.println(IsIdentical(x,y));
    }
    public static int IsIdentical(Node x, Node y)
    {
        if(x==null && y==null)
        return 1;
        else
        {boolean a =  ((x!=null && y!=null) && (x.val == y.val) && (IsIdentical(x.left,y.left)==1) && (IsIdentical(x.right, y.right)==1) );
            if(a == true)
            return 1;
            return 0;
        }}
}