{
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class Main{
	static Node head;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			head=null;
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i=1;i<n;i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
			}
			int k=sc.nextInt();
			GfG g=new GfG();
			g.rotate(head,k);
			System.out.println();
		}
	}
    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
*/
class GfG
{
	public void rotate(Node head,int k)
        {
         //add code here.
        Node h = head;
        int c = 1;
        while(c<=k && h!=null)
        {
            h = h.next;
            c++;
        }
        Node temp = h;
        if(h==null)
        return;
        if(h.next!=null)
        temp = h.next;
        Node newhead = temp;
        while( temp!=null)
        {temp = temp.next;}
        temp = head;
        h.next = null;
        while(newhead!=null)
        {
            System.out.print(newhead.data+" ");
            newhead = newhead.next;
        }
        return;
         }
        
         
}
