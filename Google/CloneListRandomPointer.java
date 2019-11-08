/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        HashMap<Node,Node> hm = new HashMap<>();        
        Node header = new Node(0);
        header.next = head;
        // Node clone_header = null;
        while(head!=null)
        {
            Node clone = new Node();
            clone.val = new Integer(head.val);
            hm.put(head,clone);
            head = head.next;
        }
        head = header.next;
        while(head!=null)
        {
            Node clone = hm.get(head);
            clone.next = hm.get(head.next);
            clone.random = hm.get(head.random);
            head = head.next;
        }
        return hm.get(header.next);
    }
}
