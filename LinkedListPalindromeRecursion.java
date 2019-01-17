
class LinkedListPalindromeRecursion {
   
    static Node head = new Node(0);
    public static void main(String[] args)
    {   
        head.next = new Node(0);
        Node a = head.next;
        a.next = new Node(1);
        a = a.next;
        a.next = new Node(2);
        a = a.next;
        a.next = new Node(0);
        a = a.next;
        a.next = new Node(0);
        System.out.println(isPalindrome(head));
    }
    static int flag = 0;
    public static boolean isPalindrome(Node h)
    {   if(h==null)
        {flag = 1- flag;
        return false;}
        isPalindrome(h.next);
        if(flag == 1)
        {   
            if( head.data == h.data)
            {   System.out.println(h.data + ","+head.data);
                head = head.next;
                return true;}
            else
            {
            System.out.println(h.data + ","+head.data);
            System.out.println("False");
            System.exit(0);

            return false;
               }       }
        

        return false;
    
}}