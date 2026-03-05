import java.util.*;
class CircularQueue{
	int[] arr;
	int front;
	int rear;
	int maxSize;
	CircularQueue(int size){
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
		this.maxSize=size;
	}

	void enqueue(int data){
		if((front==0&& rear==maxSize-1)||(rear+1)%maxSize==front){
			System.out.println("queue is full");
			return;
		}else if(front==-1){
			front=rear=0;
		}else if(rear==maxSize-1&&front!=0){
			rear=0;
		}else{
			rear++;
		}
		arr[rear]=data;
	}

	int dequeue(){
		if(front==-1){
			System.out.println("queue is empty");
			return -1;
		}else{
			int ret=arr[front];
			if(front==rear){
				front=rear=-1;
			}else if(front==maxSize-1){
				front=0;
			}else{
				front++;
			}
			return ret;
		}
	}

	void printQueue(){
		if(front==-1){
			System.out.println("queue is empty");
			return;
		}

		if(rear>=front){
			for(int i=front; i<=rear; i++){
				System.out.print(arr[i]+" ");
			}

		}else{
			for(int i=front; i<maxSize; i++){
				System.out.print(arr[i]+" ");
			}

			for(int i=0; i<=rear; i++){
				System.out.print(arr[i]+" ");
			}
		}

		System.out.println();
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		CircularQueue que=new CircularQueue(size);
		char ch;
		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.printQueue");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("enter data  to enqueeu");
					int data=sc.nextInt();
					que.enqueue(data);
					break;
				case 2:
					int ret=que.dequeue();
					if(ret!=-1){
						System.out.println(ret+"popped");
					}
					break;
				case 3:
					que.printQueue();
					break;
				default:
					System.out.println("default choice");
					break;
			}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}


