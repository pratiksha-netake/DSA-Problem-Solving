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


	int MaxNode(){

		if(head==null){
			System.out.println("linked list is empty");
			return 0;
		}
		if(head.next==null){
			return head.data;
		}

		int max=Integer.MIN_VALUE;
		Node temp=head;
		while(temp!=null){
			if(temp.data>max){
				max=temp.data;
			}
			temp=temp.next;
		}
		return max;
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
			System.out.println("linked list menu");
			System.out.println("1.insert at end");
			System.out.println("2.return max node");
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
					System.out.println("max value"+ll.MaxNode());
					break;
				case 3:
					ll.printLinkedList();
					break;
				default:
					System.out.println("invalid choice");
			}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}



