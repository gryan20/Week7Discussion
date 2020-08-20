import javax.naming.LinkLoopException;

public class Removal {

	private Node top;
	private class Node
	{
		int value;
		Node next;
		public Object item;
	}
	public void LinkedListStack()
	{
		top = null;
	}
	
	public int pop() throws LinkLoopException
	{
	if (top == null)
	{
		throw new LinkLoopException();
	}
	int value = top.value;
	top = top.next;
	Node first = null;
	int size;
	return value;
	}
	
	public void push (int value)
	{
		Node oldTop = top;
		top = new Node();
		top.value = value;
		top.next = oldTop;
	}
	public void removeBottomHalf()
	{
		Node slow_x = top;
		Node fast_x = top;
		if (top != null)
		{
			Node preview = null;
			while (fast_x != null && fast_x.next != null)
			{
				fast_x = fast_x.next.next;
				preview = slow_x;
				slow_x = slow_x.next;
			}
			
			preview.next = null;
			
		}
	}
	
	public static void main (String args[]) throws LinkLoopException
	{
		Removal stack = new Removal();
		
	stack.push(1);
	stack.push(7);
	stack.push(3);
	stack.push(4);
	stack.push(9);
	stack.push(2);
	
	printList(stack.top);
	stack.removeBottomHalf();
	printList(stack.top);
	
	}
	
	public static void printList(Node top)
	{
		Node temp = top;
			while (temp != null)
			{
				System.out.print("" + temp.value);
				temp = temp.next;
			}
			System.out.println("");
	}
	
}
