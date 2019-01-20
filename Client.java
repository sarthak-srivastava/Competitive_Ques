class Client{
    public static void main(String[] args) throws Exception
    {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addFirst(50);
        ll.display();
        System.out.println();
        System.out.println(ll.getAtIndex(3));
    }
}