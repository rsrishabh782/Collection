package LinkedList;

public class linkedListCreatiion {

	Node head;

	class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}


	public void printMyLL()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {

		linkedListCreatiion ll = new linkedListCreatiion();

		Node first = ll.new Node(10);
		ll.head=first;

		Node Second = ll.new Node(20);
		first.next=Second;

		Node third = ll.new Node(30);
		Second.next=third;

		ll.printMyLL();
	}



}
