class Node{
	int data;
	Node next;

	Node(int data){
		this.next=null;
		this.data=data;
	}

}
class reverseLinkedList{
	Node head;

	void reverseLinkedList(){
		Node prev=null;
		Node curr=head; 
		Node next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;

		}
		head=prev;
	}

	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}


	public static void main(String[] args){
		reverseLinkedList list=new reverseLinkedList();
		list.head=new Node(10);
		list.head.next=new Node(20);
		list.head.next.next=new Node(30);
                 System.out.println("original list :");
		 list.printList();

                
		 list.reverseLinkedList();
		System.out.println("Reverse list:");
		list.printList();
	}
}


