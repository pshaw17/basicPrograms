package LinkedList;


public class SinglyLinkedListLength {
	 private ListNode head; // hold the linked list
     
     private static class ListNode{   //static inner class 
   	  private int data;           // it has two properties data and pointer to the next node in the list
   	  private ListNode next;      
   	  
		public ListNode(int data) { //constructor
			super();
			this.data = data; //we only provide data part because when new list node is created its next by default points to null
			this.next = null;
		}
   	  
     }
    public int length(){
    	if(head==null) {
    		return 0;
    	}
    	int count = 0;
   	 ListNode current = head;
   	 while(current!= null) {
   		 count++;
   		 current = current.next;
   	 }
   	 return count;
    }
	public static void main(String[] args) {
		SinglyLinkedListLength list = new SinglyLinkedListLength();
    //created 4 nodes
		list.head = new ListNode(10);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(2);
		
	//Now we will connect them together to form a chain	ie Singly linked list
		
		list.head.next = second; // 10-->4
		second.next = third ; // 10-->4-->5
		third.next = fourth; //10-->4-->5-->2 -->null
		
		System.out.print("Length - " +list.length()); 
	}

}
