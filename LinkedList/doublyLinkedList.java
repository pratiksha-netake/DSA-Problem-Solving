import java.util.*;
class Node{
	Node prev=null;
	int data;
	Node next=null;
	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node head=null;
	
	//addFirst
	void addFirst(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;
			head=newNode;
			head.next.prev=head;
		}
	}

	//addLast
	void addLast(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
	}

	//count node
	int countNode(){
		int count=0;
		Node temp=head;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	//addAt position
	void addAtPos(int pos,int data){
		if(pos<=0||pos>countNode()+1){
			System.out.println("invalid position");
			return;
		}
		if(head==null){
			addFirst(data);
		}else if(pos==countNode()+1){
			addLast(data);
		}else{
			Node newNode=new Node(data);
			Node temp=head;
			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}

			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
			newNode.next.prev=newNode;
		}
	}

	//deleteFirst
	void deleteFirst(){
		if(head==null){
			System.out.println("linked list is empty");
			return;
		}

		if(countNode()==1){
			head=null;
		}else{
			head=head.next;
			head.prev=null;
		}
	}

	//delete Last
	void deleteLast(){
		if(head==null){
			System.out.println("linked list is empty");
		}
		if(countNode()==1){
			head=null;
		}else{
			Node temp=head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next.prev=null;
			temp.next=null;
		}
	}

	//delete At Position
	void deleteAtPos(int pos){
		if(pos<=0||pos>countNode()){
			System.out.println("invalid position");
			return;
		}
		if(pos==1){
			deleteFirst();
		}else if(pos==countNode()){
			deleteLast();
		}else{
			Node temp=head;
			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
	}
       //print linkedlist
	void printLinkedList(){
		Node temp=head;
		while(temp.next!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

}

class Client{
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		char ch;
		do{
			System.out.println("doubly linkedlist");
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
				}
				break;

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
						int count=ll.countNode();
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





