import java.util.*;
class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedListQueue{
	Node front=null;
	Node rear=null;

	void enqueue(int data){
		Node newNode=new Node(data);
		if(front==null){
			front=newNode;
			rear=newNode;
		}else{
			rear.next=newNode;
			rear=newNode;
		}
	}

	boolean empty(){
		if(front==null){
			return true;
		}else{
			return false;
		}
	}

	int  dequeue(){
		if(front==rear){
			int ret=front.data;
			front=rear=null;
			return ret;
		}else{
			int ret=front.data;
			front=front.next;
			return ret;
		}
	}

	int front(){
		return front.data;
	}

	int rear(){
		return rear.data;
	}

	void printQueue(){
		Node temp=front;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		LinkedListQueue que=new LinkedListQueue();
		char ch;
		do{
			System.out.println("===Queue===");
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.is empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.print queue");

			System.out.println("enter yout choice");
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
						System.out.println("deleted"+que.dequeue());}
					break;
				case 3:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{
						System.out.println("queue is not empty");
					}
					break;
				case 4:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{
						System.out.println("front:"+que.front());
					}
					break;
				case 5:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{
						System.out.println("rear:"+que.rear());
					}
					break;
				case 6:
					if(que.empty()){
						System.out.println("queue is empty");
					}else{
						que.printQueue();
					}
					break;
				default:
					System.out.println("invalid choice");
				}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}




