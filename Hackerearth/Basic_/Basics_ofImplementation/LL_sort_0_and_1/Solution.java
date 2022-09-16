package Hackerearth.Basic_.Basics_ofImplementation.LL_sort_0_and_1;

class LinkedList {

    static Node head;
   
    static class Node {
   
     int data;
     Node next;
   
     Node(int d)
     {
      data = d;
      next = null;
     }
    }
    void printList()
    {
     Node temp = head;
     while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
     }
     System.out.println();
    }
    public static void push(int new_data)
    {
     /* 1 & 2: Allocate the Node &
       Put in the data*/
     Node new_node = new Node(new_data);
   
     /* 3. Make next of new Node as head */
     new_node.next = head;
   
     /* 4. Move the head to point to new Node */
     head = new_node;
    }
   
    public static void main(String[] args)
    {
     LinkedList list = new LinkedList();
     
     // creating first linked list 1,2,2,1,2,0,2,2
     list.push(1);list.push(2);list.push(2);list.push(1);list.push(2);
     list.push(0);list.push(2);list.push(2);list.push(1);

     System.out.println("Printing list before sorting");   
     list.printList();
     
     list.sortBy012();
     System.out.println("Printing list after sorting");   
     list.printList();
    
    }
    private void sortBy012() {
        Node temp = head;
        int one = 0, two = 0, zero = 0;
        while (temp != null) {
         one += temp.data==1 ? 1 : 0;
         two += temp.data==2 ? 1 : 0;
         zero += temp.data==0 ? 1 : 0;
         temp = temp.next;
        } 
        //System.out.println(zero+" "+one+" "+two);
        temp = head;
        while(zero != 0){
            temp.data = 0;
            temp = temp.next;
            zero--;
        }
        while(one != 0){
            temp.data = 1;
            temp = temp.next;
            one--;
        }
        while(two != 0){
            temp.data = 2;
            temp = temp.next;
            two--;
        }
    }
   }
