class Tree
{
    Node mirror(Node node)
    {
	// Your code here
	if(node == null)
	return null;
	Node left  = mirror(node.left);
	Node right = mirror(node.right);
	node.left = right;
	node.right = left;
	return node;
    }
}
