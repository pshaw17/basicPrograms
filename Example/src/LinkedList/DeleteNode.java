package LinkedList;


public class DeleteNode {

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
	 	 System.out.println("null");
	  }
		  public void InsertFirst(int value) {
			  ListNode newNode = new ListNode(value);
			  newNode.next = head;
			  head = newNode;	  
		  }
	  public ListNode deleteFirst() {
		  if(head == null) {
			  return null;
		  }
		  ListNode temp = head;
		  head = head.next;
		  temp.next = null;
		  return temp;
	  }
		public static void main(String[] args) {
			DeleteNode list = new DeleteNode();
			list.InsertFirst(2);
			list.InsertFirst(5);
			list.InsertFirst(7);
			list.InsertFirst(4);
			
			list.display();
			
           System.out.println(list.deleteFirst().data);
           
           list.display();
			
		}

}
