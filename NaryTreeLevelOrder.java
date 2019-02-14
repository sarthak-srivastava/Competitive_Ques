/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<Node> q = new LinkedList<>();
        if(root == null)
            return ans;
        q.add(root);
        q.add(null);
        List<Integer> cl = new ArrayList<Integer>();
        // cl.add(root.val);
        while(q.size()!=0)
        {
            Node t = q.remove();
            if(t == null && q.peek() == null)
            break;
            if(t==null)
            {   q.add(null);
                ans.add(new ArrayList<Integer>(cl));
                cl = new ArrayList<Integer>();
                continue;
            }
            cl.add(t.val);
            for(Node c:t.children)
            {
                q.add(c);
            }
        }
        ans.add(new ArrayList<Integer>(cl));
        return ans;
    }
}
