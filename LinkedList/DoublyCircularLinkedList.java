import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
class DoublyCircularLinkedList{
	Node head=null;

	//addFirst
	void addFirst(int data){
		Node newNode=new Node(data);

		if(head==null){
			head=newNode;
			head.next=head;
			head.prev=head;
			return;
		}

		Node last=head.prev;
		newNode.next=head;
		newNode.prev=last;

		last.next=newNode;
		head.prev=newNode;

		head=newNode;
	}
	//addLast
	void addLast(int data){
		Node newNode=new Node(data);

		if(head==null){
			head=newNode;
			head.next=head;
			head.prev=head;
			return;
		}

		Node last=head.prev;
		last.next=newNode;
		newNode.prev=last;
		newNode.next=head;
		head.prev=newNode;
	}
	//countNode
	int countNode(){
		if(head==null){
			return 0;
		}

		int count=0;
		Node temp=head;

		do{
			count++;
			temp=temp.next;
		}while(temp!=head);

			return  count;
	}

	//add at position
	void addAtPos(int pos,int data){
		Node newNode=new Node(data);
		int size=countNode();

		if(pos<=0||pos>size+1){
			System.out.println("invalid position");
			return;
		}
		if(pos==1){
			addFirst(data);
			return;
		}
		if(pos==size+1){
			addLast(data);
			return;
		}

		Node temp=head;
		for(int i=1; i<pos-1; i++){
			temp=temp.next;
		}
		newNode.next=temp.next;
		newNode.prev=temp;

		temp.next.prev=newNode;
		temp.next=newNode;
	}
	//deleteFirst
	void deleteFirst(){
		if(head==null){
			System.out.println("linked lsit is empty");
			return;
		}
		if(head.next==head){
			head=null;
			return;
		}

		Node last=head.prev;

		head=head.next;
		last.next=head;
		head.prev=last;
	}
	//delete last
	void deleteLast(){
		if(head==null){
			System.out.println("linked list is empty");
			return;
		}

		if(head.next==head){
			head=null;
			return;
		}

		Node last=head.prev;
		Node secondLast=last.prev;
		head.prev=secondLast;
		secondLast.next=head;
	}
	//delete At position
	void deleteAtPos(int pos){
		int size=countNode();

		if(pos<=0||pos>size){
			System.out.println("invalid position");
			return;
		}
		if(pos==1){
			deleteFirst();
			return;
		}
		if(pos==size){
			deleteLast();
			return;
		}

		Node temp=head;
		for(int i=1; i<pos; i++){
			temp=temp.next;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
	}
	//print forward
	void printForward(){
		if(head==null){
			System.out.println("linked list is empty");
			return;
		}
		Node temp=head;
		do{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println();
	}
	//print Backward
	void printBackward(){
		if(head==null){
			System.out.println("linked list is empty");
			return;
		}

		Node temp=head.prev;
		do{
			System.out.println(temp.data+"->");
			temp=temp.prev;
		}while(temp!=head.prev);
	}
}

class Client{
	public static void main(String[] args){
		DoublyCircularLinkedList ll=new DoublyCircularLinkedList();
		Scanner sc=new Scanner(System.in);
		char ch;
		do{
			System.out.println("doubly circular linked list");
			System.out.println("1.add first");
			System.out.println("2.add last");
			System.out.println("3.add at position");
			System.out.println("4. delete first");
			System.out.println("5.delete last");
			System.out.println("6.delete at position");
			System.out.println("7.count node");
			System.out.println("8.print forward");
			System.out.println("9.print backward");

			System.out.println("enter choice");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("enter data");
					ll.addFirst(sc.nextInt());
					break;
				case 2:
					System.out.println("enter data");
					ll.addLast(sc.nextInt());
					break;
				case 3:
					System.out.println("enter data");
					int data=sc.nextInt();
					System.out.println("enter position");
					int pos=sc.nextInt();
					ll.addAtPos(pos,data);
					break;
				case 4:
					ll.deleteFirst();
					break;
				case 5:
					ll.deleteLast();
					break;
				case 6:
					System.out.println("enter position");
					ll.deleteAtPos(sc.nextInt());
					break;
				case 7:
					System.out.println("count:"+ll.countNode());
					break;
				case 8:
					ll.printForward();
					break;
				case 9:
					ll.printBackward();
					break;
				default:
					System.out.println("invalid choice");
				}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}
}


	
