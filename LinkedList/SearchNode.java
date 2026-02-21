import java.util.*;
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

	boolean SearchNode(int target){
		Node temp=head;

		while(temp!=null){
			if(temp.data==target){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
}

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value to search");
		int target=sc.nextInt();
		LinkedList ll=new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		boolean result=ll.SearchNode(target);
		System.out.println(result);
	}
}



