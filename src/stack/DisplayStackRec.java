package stack;

import java.util.Stack;

public class DisplayStackRec {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		displaySt(st);
	}

	private static void displaySt(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		
		int top = st.pop();		
		displaySt(st);
		
		System.out.print(top+" ");
		st.push(top);
	}
}
