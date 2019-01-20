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
    public void display()
    {
        Node temp = this.head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void addFirst(int data)
    {
        if(this.size == 0)
        { this.handlewhensize0(data);
        return;}
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        return;

    }
    public int getFirst() throws Exception {
        if(this.size == 0)
        throw new Exception("LinkedList is still empty");
        return head.data;
    }
    public int getLast() throws Exception {
        if(this.size == 0)
        throw new Exception("LinkedList is still empty");
        return tail.data;
    }
    public int getAtIndex(int idx) throws Exception
    {
        if(idx < 0 || idx >= this.size)
        {
            throw new Exception("Index out of bounds");
        }
        if(this.size == 0)
        {throw new Exception("No elements in the linkedlist");
    }
        Node n = new Node();
        for(int i = 0;i< idx;i++)
        {
            n = n.next;
        }
        return n.data;
        
        
    }
}