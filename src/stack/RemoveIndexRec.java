package stack;

import java.util.Stack;

public class RemoveIndexRec {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		int idx = 2;
		System.out.println(st);
		removeFromIdx(st,idx);
		System.out.println(st);
	}

	private static void removeFromIdx(Stack<Integer> st, int idx) {
		if (idx < 0 || st.isEmpty()) {
			return;
		}
		
		int ele = st.pop();
		
		if (idx != 0) {
			removeFromIdx(st,idx-1);
			st.push(ele);
		}
	}
}
