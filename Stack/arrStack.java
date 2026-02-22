import java.util.*;
class Stack{
	int maxSize;
	int top=-1;
	int stackArr[];

	Stack(int maxSize){
		this.maxSize=maxSize;
		stackArr=new int[maxSize];
	}
        //push 
	 void push(int data){
		 if(top==maxSize-1){
			 System.out.println("stack overflow");
			 return;
		 }
		 top++;
		 stackArr[top]=data;
		 
	 }

         //to check empty
	 boolean empty(){
		 if(top==-1){
			 return true;
		 }else{
			 return false;
		 }
	 }

	 //pop
	 int pop(){
		 if(empty()){
			 System.out.println("stack underflow");
			 return -1;
		 }else{
			 int val=stackArr[top];
			 top--;
			 return val;
		 }
	 }
	 //peek
	 int peek(){
		 if(empty()){
			 System.out.println("stack underflow");
			 return -1;
		 }else{
			 return stackArr[top];
		 }
	 }
	 //size
	 int size(){
		 return top+1;
	 }

	 //print
	 void printStack(){
		 System.out.print("[");
		 for(int i=top; i>=0; i--){
			 System.out.print(stackArr[i]+" ");
		 }
		 System.out.println("]");
	 }
}

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter stack size");
		int size=sc.nextInt();

		Stack s=new Stack(size);
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
						System.out.println("top element"+topEle);
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
					}while(ch=='y'||ch=='Y');
			}
		}


