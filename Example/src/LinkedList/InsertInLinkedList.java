package LinkedList;

public class InsertInLinkedList {
	private  ListNode head;
	
  private static class ListNode{
	  private int data;
	  private ListNode next;
	public ListNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	  
  }
  
  public void display(){
 	 ListNode current = head;
 	 while(current!= null) {
 		 System.out.print(current.data + "-->");
 		 current = current.next;
 	 }
 	 System.out.print("null");
  }
	  public void InsertFirst(int value) {
		  ListNode newNode = new ListNode(value);
		  newNode.next = head;
		  head = newNode;	  
	  }
  
	public static void main(String[] args) {
		InsertInLinkedList list = new InsertInLinkedList();
		list.InsertFirst(2);
		list.InsertFirst(5);
		list.InsertFirst(7);
		list.InsertFirst(4);
		
		list.display();

	}

}
