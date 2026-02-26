import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class CircularQueue{
	Node front=null;
	Node rear=null;

	void enqueue(int data){
		Node newNode=new Node(data);
		if(front==null){
			front=rear=newNode;
			rear.next=front;
		}else{
			rear.next=newNode;
			rear=newNode;
			rear.next=front;
		}
	}

	boolean empty(){
		if(front==null){
			return true;
		}else{
			return false;
		}
	}

	int dequeue(){
		if(front==null){
			System.out.println("queue is empty");
		}
		int val=front.data;
		if(front==rear){
			front=rear=null;
		}else{
			front=front.next;
			rear.next=front;
		}
		return  val;
	}

	int getFront(){
		return front.data;
	}
	int getRear(){
		return rear.data;
	}
	void printQueue(){
		Node temp=front;
		do{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=front);
		System.out.println();
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		CircularQueue que=new CircularQueue();
		char ch;
		do{
			System.out.println("===Circular Queue===");
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.Is empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.print Queue");

			System.out.println("enter your choice");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("enter data");
					int data=sc.nextInt();
					que.enqueue(data);
					break;
				case 2:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{
						System.out.println("deleted"+que.dequeue());
					}
					break;
				case 3:
					System.out.println(que.empty()?"queue is empty":"queue is not empty");
					break;
				case 4:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{						
						System.out.println("front:"+que.getFront());
					}
					break;
				case 5:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{
						System.out.println("rear:"+que.getRear());
					}
					break;
				case 6:
					que.printQueue();
					break;
				default:
					System.out.println("invalid choice");
				}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}






		

