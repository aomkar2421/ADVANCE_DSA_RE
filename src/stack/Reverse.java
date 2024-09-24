package stack;

import java.util.Stack;

public class Reverse {
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
		Stack<Integer> gt = new Stack<Integer>();
		while (st.size()>0) {
			gt.push(st.pop());
		}
		
		Stack<Integer> at = new Stack<Integer>();
		while (gt.size()>0) {
			at.push(gt.pop());
		}

		while (at.size()>0) {
			st.push(at.pop());
		}
		
	}
}
