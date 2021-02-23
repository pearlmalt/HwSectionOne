package ep1;

public class DoublyLinkedList4_14 {



	private Node head;
	private Node Tail;
	private Node tail2;
	class Node {
		Node previous;
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;		
		}
	}

	public void insert(int data) {
		Node newNode=new Node(data);
		
		tail2 = null;
		if(head==null) {
			head=tail2=newNode;
			head.previous=null;
			tail2.next=null;
		}else {
			tail2.next=newNode;
			newNode.previous=tail2;
		}
	}

	public Node getTail() {
		return Tail;
	}

	public void setTail(Node tail) {
		Tail = tail;
	}
	
	public void printDoublyList() {
		Node cuNode=head;
		while (cuNode!=null) {
			System.out.println(cuNode.data);
			cuNode=cuNode.next;
			
		}}}
		
	