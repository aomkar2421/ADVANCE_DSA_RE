package stack;

import java.util.Stack;

public class ReverseRec {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}

	private static void reverse(Stack<Integer> st) {
		if (st.size()==1) {
			return;
		}
		
		int top = st.pop();		
		reverse(st);
		insertAtBottom(st, top);

	}
	
	private static void insertAtBottom(Stack<Integer> st, int ele) {
		if (st.isEmpty()) {
			st.push(ele);
			return;
		}
		
		int top = st.pop();		
		insertAtBottom(st, ele);
		
		st.push(top);
	}
}
