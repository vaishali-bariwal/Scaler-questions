package Hackerearth.Basic_.Basics_ofImplementation.detect_loop_in_ll;

//Floyd’s Cycle-Finding Algorithm t
class LinkedList {
	Node head; 
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	void detectLoop()
	{
		Node slow_p = head, fast_p = head;
		int flag = 0;
		while (slow_p != null && fast_p != null
			&& fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Loop found");
		else
			System.out.println("Loop not found");
	}

	/* Driver program to test above functions */
	public static void main(String args[])
	{
		LinkedList linkelist = new LinkedList();

		linkelist.push(20);
		linkelist.push(4);
		linkelist.push(15);
		linkelist.push(10);

		/*Create loop for testing */
		linkelist.head.next.next.next.next = linkelist.head;

		linkelist.detectLoop();
	}
}