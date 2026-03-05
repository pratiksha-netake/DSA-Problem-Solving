import java.util.*;
class Dequeue{
	int[] arr;
	int front;
	int rear;
	int size;

	Dequeue(int size){
		this.size=size;
		arr=new int[size];
		front=-1;
		rear=-1;
	}

	boolean isFull(){
		if((front==0&&rear==size-1)||(rear+1)%size==front){
			System.out.println("queue array s full");
			return true;
		}else{
			return false;
		}
	}

	boolean isEmpty(){
		if(front==-1){
			return true;
		}else{
			return false;
		}
	}

	void insertFront(int data){
		if(isFull()){
			System.out.println("dequeue is full");
			return;
		}
		if(isEmpty()){
			front=rear=0;
		}else if(front==0){
			front=size-1;
		}else {
			front--;
		}
		arr[front]=data;
	}


	void insertRear(int data){
		if(isFull()){
			System.out.println("dequeue is full");
			return;
		}
		if(isEmpty()){
			front=rear=0;
		}else if(rear==size-1){
			rear=0;
		}else{
			rear++;
		}
		arr[rear]=data;
	}

	void deleteFront(){
		if(isEmpty()){
			System.out.println("dequeue is empty");
			return;
		}

		if(front==rear){
			front=rear=-1;
		}else if(front==size-1){
			front=0;
		}else{
			front++;
		}
	}

	void deleteRear(){
		if(isEmpty()){
			System.out.println("dequeue is empty");
			return;
		}
		if(front==rear){
			front=rear=-1;
		}else if(rear==0){
			rear=size-1;
		}else{
			rear--;
		}
	}

	void printDeque(){
		if(isEmpty()){
			System.out.println("dequeu is empty");
			return;
		}

		int i=front;
		while(true){
			System.out.print(arr[i]+" ");
			if(i==rear)
				break;
			i=(i+1)%size;
		}
		System.out.println();
	}	
}

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arry");
		int size=sc.nextInt();

		Dequeue que=new Dequeue(size);
		char ch;
		do{
			System.out.println("===Dequeue==");
			System.out.println("1.Insert Front");
			System.out.println("2.Insert Rear");
			System.out.println("3.Delete Front");
			System.out.println("4.Delete Rear");
			System.out.println("5.print Dequeue");
			System.out.println("enter your choice");

			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("enter value");
					int data=sc.nextInt();
					que.insertRear(data);
					break;
				case 2:
					System.out.println("enter data");
					int data=sc.nextInt();
					que.insertRear(data);
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
					break;
				}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}
}
		


