class GFG
{  public static int count=0;
    int countSubtreesWithSumX(Node root, int x)
    {
      count=0;
	  Sum(root,x);
	 
	  return count;
    }
    int Sum(Node node,int x)
    {
        
        if(node==null)
        {
            return 0;
        }
        else
        {
            int sum=node.data+Sum(node.left,x)+Sum(node.right,x);
           // System.out.print(sum+" ");
            if(sum==x)
            {
                count++;
            }
            return sum;
        }
    }
}
