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
	Node  head=null;
         //add first node
	void addFirst(int data){
		Node NewNode=new Node(data); 
		if(head==null){
			head=NewNode;
		}else{
			NewNode.next=head;
			head=NewNode;
		}
	}
 
	//add last node
	void addLast(int data){
 		Node NewNode=new Node( data);

		if(head==null){
			head=NewNode;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=NewNode;
		}
	}

        //count node
        int CountNode(){
	       int count=0;
	       Node temp=head;
	       while(temp!=null){
		       count++;
		       temp=temp.next;
	       }
	       return count;
	}

        //add at position
	void addAtPos(int pos,int data){
		if(pos<=0||pos>CountNode()+1){
			System.out.println("wrong input for position");
		}

		if(pos==1){
			addFirst(data);
		}else if(pos==CountNode()+1){
			addLast(data);
		}else{

			Node NewNode=new Node(data);
			Node temp=head;
			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}
			NewNode.next=temp.next;
			temp.next=NewNode;
		}
	}

      //delete first node
	void deleteFirst(){
		if(head==null){
			System.out.println("linked list is empty");
		}else{
			head=head.next;
		}
	}

       //delete last node
	void deleteLast(){
		if(head==null){
			System.out.println("linked list is empty");
		}
		if(CountNode()==1){
				head=null;
		}else{
			Node temp=head;

			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next=null;
		}
	}
        //delete at position
	void deleteAtPos(int pos){
		if(pos<=0||pos>CountNode()){
			System.out.println("wrong input for position");
			return;
		}
		if(pos==1){
			deleteFirst();
		}else if(pos==CountNode()){
			deleteLast();
		}else{
			Node temp=head;
			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}
			temp.next=temp.next.next;
		}
	}
        //print linkedlist
	void printLinkedList(){
		if(head==null){
			System.out.println("linkedlist is empty");
		}else{
			Node temp=head;
			while(temp.next!=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
			
		}
	}
}



class Client{
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		char ch;
		do{
			System.out.println("Singly LinkedList");
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.deleteFirst");
			System.out.println("5.deleteLast");
			System.out.println("6.deleteAtPos");
			System.out.println("7.countNode");
			System.out.println("8.printLinkedList");

			System.out.println("enter your choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
				case 1:{
					       System.out.println("enter data");
					       int data=sc.nextInt();
					       ll.addFirst(data);
				}
				break;
				case 2:{
					       System.out.println("enter data");
					       int data=sc.nextInt();
					       ll.addLast(data);
				}
				break;
				case 3:{
					       System.out.println("enter data");
					       int data=sc.nextInt();
					       System.out.println("enter position");
					       int pos=sc.nextInt();
					       ll.addAtPos(pos,data);

				}
				break;
				case 4:
					       ll.deleteFirst();
					       break;
				case 5:
					       ll.deleteLast();
					       break;
				case 6:
					       System.out.println("enter position");
					       int pos=sc.nextInt();
					       ll.deleteAtPos(pos);
					       break;
			        case 7:
					       int count=ll.CountNode();
					       System.out.println(count);
					       break;
                                case 8:
					       ll.printLinkedList();
					       break;
			        default:
					       System.out.println("wrong input");
			}

			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
