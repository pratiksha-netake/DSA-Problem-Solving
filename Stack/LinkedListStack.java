import java.util.*;
class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
	}
}
class Stack{
	Node top=null;
        //push
	void push(int data){
		Node newNode=new Node(data);
		if(top==null){
			top=newNode;
		}else{
			newNode.next=top;
			top=newNode;
		}
	}
	//pop
	int pop(){
		int val=top.data;
		top=top.next;
		return val;
	}
	//peek
	int peek(){
		return top.data;
	}
	//size
	int size(){
		Node temp=top;
		int count=0;
		while(temp.next!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	//to check empty
	boolean empty(){
		if(top==null){
			return true;
		}else{
			return false;
		}
	}
	//print stack
	void printStack(){
		if(empty()){
			System.out.println("stack is empty");
			return;
		}
		Node temp=top;
		System.out.print("[");
		while(temp.next!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(temp.data+"]");
	}
}

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Stack s=new Stack();
		char ch;
		do{
			System.out.println("stack menu");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.size");
			System.out.println("5.check empty");
			System.out.println("6.print stack");

			System.out.println("enter your choice");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("enter data");
					int data=sc.nextInt();
					s.push(data);
					break;
				case 2:
					int popped=s.pop();
					if(popped!=-1)
						System.out.println("popped element"+popped);
					break;
				case 3:
					int topEle=s.peek();
					if(topEle!=-1)
						System.out.println("top ele"+topEle);
					break;
				case 4:
					System.out.println("stack size"+s.size());
					break;
				case 5:
					System.out.println("is stack empty"+s.empty());
					break;
				case 6:
					s.printStack();
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


