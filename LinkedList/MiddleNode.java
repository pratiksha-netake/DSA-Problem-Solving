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

	void MiddleNode(){
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		Node slow=head;
		Node fast=head.next;
		while(fast!=null){
			fast=fast.next;
			if(fast!=null){
				fast=fast.next;
			}
			slow=slow.next;
		}
		System.out.println(slow.data);
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

		ll.MiddleNode();
	}
}

