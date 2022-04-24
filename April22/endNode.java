package April22;

class endNode {
    Node head;  
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
 
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        new_node.next = null;
 
        Node last = head;
        while (last.next != null)
            last = last.next;
 
        last.next = new_node;
        return;
    }
 
    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
 
    public static void main(String[] args)
    {
        endNode llist = new endNode();
 
        llist.append(2);
 
        llist.append(4);
 
        llist.append(1);
 
        llist.append(3);

        llist.append(8);

        llist.append(5);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
 
        llist.append( 20);
 
        System.out.println("\nAfter adding last element Linked list is: ");
        llist.printList();
    }

}
