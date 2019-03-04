{
//Initial Template for Java
import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
public class LinkedList1
{
    Node head;  // head of lisl
    Node lastNode;
    static PrintWriter out;
    /* Linked list Node*/
    /* Utility functions */
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            out.print(temp.data+" ");
            temp = temp.next;
        }
        out.println();
    }
    /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {
        /* Constructed Linked List is 1->2->3->4->5->6->
         7->8->8->9->null */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t= Integer.parseInt(br.readLine());
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine());
            LinkedList1 llist = new LinkedList1();
                        String nums[] = br.readLine().split(" ");
            if (n > 0)
            {
                int a1= Integer.parseInt(nums[0]);
                Node head= new Node(a1);
                llist.addToTheLast(head);
            }
            for (int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(nums[i]);
                llist.addToTheLast(new Node(a));
            }
            llist.head = new gfg().reverse(llist.head);
            
            llist.printList();
            
            t--;
        }
        out.close();
    }
}

}

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
        if(head == null)
        return head;
        if(head.next == null)
        return head;
        Node prev = null;
        Node curr = head;
        Node n = head.next;
        while(n!=null)
        {   Node t = curr;
            curr.next = prev;
            prev = t;
            curr = n;
            n = n.next;
        }
        Node t = curr;
            curr.next = prev;
            prev = t;
            curr = n;
        return prev;
   }
}
