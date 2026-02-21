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
		}
		temp.next=newNode;
	}

	int SumNodes(){

		if(head==null){
			return 0;
		}

		Node temp=head;
		int Sum=0;
		while(temp!=null){
			Sum=Sum+temp.data;
			temp=temp.next;
		}
		return Sum;
	}
}

class Client{
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		//ll.addLast(1);
		//ll.addLast(2);
		//ll.addLast(3);
		//ll.addLast(4);
		int result=ll.SumNodes();
		System.out.println(result);
	}
}
