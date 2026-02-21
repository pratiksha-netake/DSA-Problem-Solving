import java.util.*;
class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class CircularLinkedList{
	Node head=null;

	void addFirst(int data){
		Node newNode=new Node(data);
		
		if(head==null){
			head=newNode;
			newNode.next=head;
			return;
		}

		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}
		newNode.next=head;
		temp.next=newNode;
		head=newNode;
	}

	void addLast(int data){
		Node newNode=new Node(data);

		if(head==null){
			head=newNode;
			newNode.next=head;
			return;
		}

		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}temp.next=newNode;
		newNode.next=head;
	}

	int CountNode(){
		if(head==null){
			return 0;
		}

		int count=0;
		Node temp=head;
		do{
			count++;
			temp=temp.next;
		}while(temp!=head);
		return count;
	}

	void addAtPos(int pos,int data){
		int size=CountNode();
                Node newNode=new Node(data);
		if(pos<=0||pos>size+1){
			System.out.println("wrong input for position");
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
		temp.next=newNode;
	}

	void deleteFirst(){
		if(head==null){
			System.out.println("linkedlist is empty");
			return;
		}

		if(head.next==head){
			head=null;
			return;
		}

		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}
		temp.next=head.next;
		head=head.next;
	}
	//delete last
	void deleteLast(){
		if(head==null){
			System.out.println("linkedlist is empty");
			return;
		}

		if(head.next==head){
			head=null;
			return;
		}

		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=head;
	}
	//delete At Position
	void deleteAtPos(int pos){
		int size=CountNode();
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
		for(int i=1; i<pos-1; i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}

	void printLinkedList(){
		if(head==null){
			System.out.println("linkedlist is empty");
			return;
		}
		Node temp=head;
		do{
			System.out.println(temp.data+"->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println("back to head");
	}
}
class Client{
	public static void main(String[] args){
		CircularLinkedList ll=new CircularLinkedList();
		char ch;
		do{
			System.out.println("Singly Circular Linked List");
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.deleteFirst");
			System.out.println("5.deleteLast");
			System.out.println("6.deleteAtPos");
			System.out.println("7.countNode");
			System.out.println("8.printLinkedList");

			System.out.println("enter your choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
				case 1:{
					       System.out.println("enter data");
					       int data=sc.nextInt();
					       ll.addFirst(data);
				}break;
				case 2:{
					       System.out.println("enter data");
					       int data=sc.nextInt();
					       ll.addLast(data);
				}
				break;
				case 3:{
					       System.out.println("enter data");
					       int data=sc.nextInt();
					       System.out.println("enter position");
					       int pos=sc.nextInt();
					       ll.addAtPos(pos,data);
				}
				break;
				case 4:
						ll.deleteFirst();
						break;
				case 5:
						ll.deleteLast();
						break;
				case 6:
						System.out.println("enter position");
						int pos=sc.nextInt();
						ll.deleteAtPos(pos);
						break;
				case 7:
						int count=ll.CountNode();
						System.out.println(count);
						break;
				case 8:
						ll.printLinkedList();
						break;
				default:
						System.out.println("wrong input");
			}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
                                         














