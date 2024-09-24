package stack;

import java.util.Stack;

public class PushBottomRecu {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		int ele = 6;
		pushBottom(st,ele);
		System.out.println(st);
	}

	private static void pushBottom(Stack<Integer> st, int ele) {
		if (st.isEmpty()) {
			st.push(ele);
			return;
		}
		
		int top = st.pop();		
		pushBottom(st, ele);
		
		st.push(top);
	}
}
