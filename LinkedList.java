public class LinkedList
{
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size == 0;
    }
    public void addLast(int data)
    {   if(this.size == 0)
        {
            this.handlewhensize0(data);
            return;
        }
        Node node = new Node();
        node.data = data;
        // attach
        tail.next = node;

        tail = node;
        this.size++;
    }
    private void handlewhensize0(int data)
    {
        Node node = new Node();
        
        node.data = data;
        node.next = null;

        this.head = this.tail = node;
        this.size ++ ;
    }
}