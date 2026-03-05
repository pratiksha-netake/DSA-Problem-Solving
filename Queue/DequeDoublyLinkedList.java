import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data=data;
	}
}
class DequeLinkedList{

	Node head,tail;
	boolean isEmpty(){
		if(head==null){
			return true;
		}else{
			return false;
		}
	}

	void insertFront(int data){
		Node newNode=new Node(data);

		if(isEmpty()){
			head=tail=newNode;
		}else{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}

	void insertRear(int data){
		Node newNode=new Node(data);

		if(isEmpty()){
			head=tail=newNode;
		}else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
	}

	void deleteFront(){
		if(isEmpty()){
			System.out.println("dequeu is empty");
			return;
		}
		if(head==tail){
			head=tail=null;
		}else{
			head=head.next;
			head.prev=null;
		}
	}

	void deleteRear(){
		if(isEmpty()){
			System.out.println("dequee is empty");
			return;
		}
		if(head==tail){
			head=tail=null;
		}else{
			tail=tail.prev;
			tail.next=null;
		}
	}

	void printDeque(){
		if(isEmpty()){
			System.out.println("deque is empty");
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
class Client{
	public static void main(String[] args){
		DequeLinkedList que=new DequeLinkedList();
		Scanner sc=new Scanner(System.in);
		char ch;
		do{
			System.out.println("===deque doubly LinkedList===");
			System.out.println("1.Insert front");
			System.out.println("2.Insert rear");
			System.out.println("3.delete front");
			System.out.println("4.delete rear");
			System.out.println("5.print deque");

			System.out.println("enter your choice");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("enter data");
					int val1=sc.nextInt();
					que.insertFront(val1);
					break;
				case 2:
					System.out.println("enter data)");
					int val2=sc.nextInt();
					que.insertRear(val2);
					break;
				case 3:
					que.deleteFront();
					break;
				case 4:
					que.deleteRear();
					break;
				case 5:
					que.printDeque();
					break;
				default:
					System.out.println("invalid choice");
			}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
