class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head=null;

	void addLast(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}

		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}temp.next=newNode;
	}

	void reverse(){
		Node prev=null;
		Node curr=head;
		Node next=null;

		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}

	void printLinkedList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
}

class Client{
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		System.out.println("original LinkedList");
		ll.printLinkedList();
		System.out.println("reverse linked list");
		ll.reverse();
		ll.printLinkedList();
	}
}
	

		 
