
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//function Template for Java
/* Return reference of new head of the reverse linked list 
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */
class gfg
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverse(Node head)
   {
        // add code here
        if(head==null)
        return head;
        Node p = new Node(head.data);
        Node q = head.next;
        while(q!=null)
        {   Node temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        return p;
        
   }
}
