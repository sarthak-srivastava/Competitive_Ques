

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*  A Binary Search Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    int isBST(Node root)  
    {
       return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public int isBST(Node root, int min, int max)
    {
        if(root == null)
        return 1;
        if(root.data<min || root.data>max)
        return 0;
        return (isBST(root.left,min,root.data) + isBST(root.right,root.data,max))/2 ;
    }
}
