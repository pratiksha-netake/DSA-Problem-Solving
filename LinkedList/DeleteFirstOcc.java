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

	void deleteFirstOcc(int key){
		if(head==null){
			System.out.println("linked list is empty");
			return;
	        }

		if(head.data==key){
			head=head.next;
			System.out.println("deleted"+key);
			return;
		}

		Node temp=head;
		while(temp.next!=null &&temp.next.data!=key){
			temp=temp.next;
		}

		if(temp.next==null){
			System.out.println("value not found");
			return;
		}

		temp.next=temp.next.next;
		System.out.println("deleted"+key);
	}

	void printLinkedList(){
		if(head==null){
			System.out.println("linked list is empty");
			return;
		}

		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		char ch;
		do{
			System.out.println("Linked list menu");
			System.out.println("1.Insert at end");
			System.out.println("2.delete first occurance");
			System.out.println("3.print LinkedList");

			System.out.println("enter your choice");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("enter data");
					int data=sc.nextInt();
					ll.addLast(data);
					break;

				case 2:
					System.out.println("enter value to delete");
					int key=sc.nextInt();
					ll.deleteFirstOcc(key);
					break;
				case 3:
					ll.printLinkedList();
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

