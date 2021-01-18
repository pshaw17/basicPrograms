package LinkedList;

public class MiddleNode {

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
	  
		  public ListNode getMiddleNode() {
			  if(head == null) {
				  return null;
			  }
			  ListNode slowptr = head;
			  ListNode fastptr = head;
			  
			  while(fastptr != null && fastptr.next !=null ) {
				  slowptr = slowptr.next;
				  fastptr = fastptr.next.next;	  
			  }
			  
			  return slowptr;
		  }
		  
		public static void main(String[] args) {
			MiddleNode list = new MiddleNode();
			list.InsertFirst(2);
			list.InsertFirst(5);
			list.InsertFirst(7);
			list.InsertFirst(4);
			
			list.display();
            ListNode middleNode = list.getMiddleNode();
            System.out.println("middle Node is " + middleNode.data);
            
		}
}
