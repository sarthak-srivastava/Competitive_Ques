import java.util.*;
class SqRootNodeLL{
    public static void main(String[] args)
    {
        Node head = new Node(1);
        Node a = head;
        a.next = new Node(2);
        a = a.next;
        a.next = new Node(3);
        a = a.next;
        a.next = new Node(4);
        System.out.println("Square Root of length Node is : " );
        sqRootNode(head);
    }
    public static void sqRootNode(Node head)
    {   
        if(head == null)
        return;
        int i = 1; int j = 1;
        Node sqRoot = null;
        while(head!=null)
        {
            if(j*j == i)
            {
                if(sqRoot == null)
                sqRoot = head;
                else
                sqRoot = sqRoot.next;
                j++;
            }
            i++;
            head = head.next;
        }
        System.out.println(sqRoot.data);
        return;
    }
}