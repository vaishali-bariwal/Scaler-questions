package Hackerearth.Basic_.Basics_ofImplementation.LL_add_one_number;

class Solution{

    public static void main(String args[])
    {
     LinkedList llist = new LinkedList();
     /* Constructed Linked List is 1->2->3->4->5->null */
     llist.push(3);
     llist.push(2);
     llist.push(1);
   
     System.out.println(
      "Linked List before moving last to front ");
     llist.printList();
     
     // Function call
     llist.head = addOne(llist.head);
   
     System.out.println(
      "Linked List after moving last to front ");
     llist.printList();
    }

    private static Node addOne(Node head) {

        int carry = addOneWithCarry(head);
        if(carry != 0){
            Node newNode = new Node(carry);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private static int addOneWithCarry(Node head) {
        if(head == null)
            return 1;
        int sum = head.data + addOneWithCarry(head.next);
        head.data = sum % 10;
        return sum / 10;
    }
}