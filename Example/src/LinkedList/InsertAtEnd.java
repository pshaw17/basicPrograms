package LinkedList;

public class InsertAtEnd {
    private ListNode head;
    
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
    
    public void InsertLast(int value) {
    	ListNode newNode = new ListNode(value);
    	if(head == null) {
    		head = newNode;
    		return;
    	}
    	ListNode current = head;
    	while(null !=current.next) {
    		current = current.next;
    	}
    	 current.next = newNode;
    }
	public static void main(String[] args) {
		InsertAtEnd var = new InsertAtEnd();
		var.InsertLast(23);
		var.InsertLast(45);
		var.InsertLast(34);
		var.InsertLast(32);
		var.display();

	}

}
