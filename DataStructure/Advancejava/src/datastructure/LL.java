package datastructure;

public class LL {
	Node head;
	class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public  void addFirst(String data)
	{
		Node newnode=new Node(data);
		if(head == null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public void addlast(String data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;;
			return;
		}
		Node currnode=head;
		while(currnode.next!=null)
		{
			currnode=currnode.next;
		}
		currnode.next=newnode;
	}
	public void print()
	{
		
		if(head==null)
		{
			System.out.println("the list is empty");
			return;
		}
		Node currnode=head;
		while(currnode!=null)
		{
			System.out.println(currnode.data+"--->");
			currnode=currnode.next;
		}
		System.out.println("null");
	}
	public void deletefirst()
	{
		if(head==null)
		{
			System.out.println("it is empty to delete");
			return;
		}
		head=head.next;
		
		
	}

	
	public static void main(String[] args) {
		LL l=new LL();
		l.addFirst("is");
		l.addFirst("this");
		l.print();
		l.addlast("uuu");
		l.print();
		l.deletefirst();
		l.print();
	}

}
