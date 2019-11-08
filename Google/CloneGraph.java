/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
       HashMap<Node,Node> hm = new HashMap<>();
       
        return cloneGraphHelper(node, hm);
        
        
    }
    public Node cloneGraphHelper(Node node, HashMap<Node,Node> hm)
    {
        if(node == null)
            return null;
        if(hm.containsKey(node))
            return hm.get(node);
        Node copy_node = new Node(node.val,new ArrayList<>());
        hm.put(node,copy_node);
        for(Node i:node.neighbors)
        {
            copy_node.neighbors.add(cloneGraphHelper(i,hm));
        }
        return copy_node;
    }
    
}
