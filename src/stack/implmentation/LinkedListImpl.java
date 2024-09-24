package stack.implmentation;

class StackException extends Exception{
	StackException(String msg){
		super(msg);
	}
}

public class LinkedListImpl {	

	static class Node{
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static class StackLL{

		Node head = null;
		int size = 0;

		private void push(int i) {
			Node temp = new Node(i);
			temp.next = head;
			head = temp;
			size++;
		}


		private int pop() throws StackException {
			if (head == null) {
				throw new StackException("Stack is empty");
			}
			int val = head.val;
			head = head.next;
			return val;
		}


		private int peek() throws StackException {
			if (head == null) {
				throw new StackException("Stack is empty");
			}
			return head.val;
		}


		public void display() {
			displayRec(head);
			System.out.println();
		}

		
		private void displayRec(Node h) {
			if (h==null) {
				return;
			}
			displayRec(h.next);
			System.out.print(h.val+" ");
		}


		private void displayRev() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.val+" ");
				temp = temp.next;
			}
			System.out.println();
		}


		private int size() {
			return size;
		}


		private boolean isEmpty() {
			if (size==0) {
				return true;
			} else {
				return false;				
			}
		}

	}

	public static void main(String[] args) throws StackException {
		StackLL st = new StackLL();
		System.out.println("Size : "+st.size());
		System.out.println(st.isEmpty());

		st.push(2);
		st.push(4);
		st.push(8);
		st.push(9);
		st.push(3);
		st.display();

		System.out.println("size : "+st.size());
		System.out.println(st.isEmpty());

		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.display();
	}
}
