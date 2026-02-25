import java.util.*;
class Queue{
	int front=-1;
	int rear=-1;
	int maxSize;
	int[] queArr;
	Queue(int maxSize){
		this.maxSize=maxSize;
		queArr=new int[maxSize];
	}
        //add
	void enqueue(int data){
		if(rear==maxSize-1){
			System.out.println("queue is full");
			return;
		}

		if(front==-1){
			front=rear=0;
		}else{
			rear++;
		}
		queArr[rear]=data;
	}
        //to check empty
	boolean empty(){
		if(front==-1){
			return true;
		}else{
			return false;
		}
	}

	//delete
	int  dequeue(){
		int val=queArr[front];
		front++;
		if(front>rear){
			front=rear=-1;
		}
		return val;
	}
	//return front
	int front(){
		return queArr[front];
	}
	//return rear
	int rear(){
		return queArr[rear];
	}
	// to print queue
	void printQueue(){
	       for(int i=front; i<=rear; i++){
	       		System.out.print(queArr[i]+" ");
	       }
		System.out.println();
	}		
}

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of queue");
		int maxSize=sc.nextInt();

		Queue que=new Queue(maxSize);
		char ch;

		do{
			System.out.println("==Queue==");
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.is empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.print queue");
			
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
						System.out.println("rear"+que.rear());
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
