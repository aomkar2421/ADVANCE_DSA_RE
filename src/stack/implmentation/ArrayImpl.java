package stack.implmentation;

public class ArrayImpl {
	
	static class StackException extends Exception{
		StackException(String msg){
			super(msg);
		}
	}
	
	
	static class Stack{

		int [] arr = new int[5];
		int idx = 0;
		
		
		private void push(int i) throws StackException {
			if (idx == arr.length) {
				throw new StackException("Stack is full");
			}
			arr[idx] = i;
			idx++;
		}
		

		private int pop() throws StackException {
			if (idx <= 0) {
				throw new StackException("Stack is empty");
			}
			int top = arr[idx-1];
			arr[idx-1] = 0;
			idx--;
			return top;
		}

		
		private int peek() throws StackException {
			if (idx <= 0) {
				throw new StackException("Stack is empty");
			}
			int top = arr[idx-1];
			return top;
		}
		
		
		private void display() {
			for (int i = 0; i < idx; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		
		private int size() {
			return idx;
		}
		
		
		private int capacity() {
			return arr.length;
		}
		
		
		private boolean isEmpty() {
			if (idx==0) {
				return true;
			} else {
				return false;
			}
		}
		
		
		private boolean isFull() {
			if (idx==arr.length) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	public static void main(String[] args) throws StackException {
		Stack st = new Stack();
		System.out.println("Size : "+st.size());
		System.out.println(st.isEmpty());

		st.push(2);
		st.push(4);
		st.push(8);
		st.push(9);
		st.push(3);
		st.display();
		
		System.out.println(st.size());
		System.out.println(st.capacity());
		System.out.println(st.isFull());
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.display();
	}
}
