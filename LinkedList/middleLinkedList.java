class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=next;
	}
}

class MiddleLinkedList{

	Node head;
	void insert(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
	}

	void findMiddle(){
		Node slow=head;
		Node fast=head;

		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}

		System.out.println("Middle element:"+slow.data);


	}

	public static void main(String[] args){
		MiddleLinkedList list=new MiddleLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);

		list.findMiddle();
	}
}




