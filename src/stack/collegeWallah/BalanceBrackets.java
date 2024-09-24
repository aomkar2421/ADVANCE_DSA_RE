package stack.collegeWallah;

import java.util.Stack;

public class BalanceBrackets {
	public static void main(String[] args) {
		String str = "(())()(";
		System.out.println(isBalanced(str));
	}

	private static boolean isBalanced(String str) {

		Stack<Character> st = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='(') {
				st.push('(');
			}else {
				if (st.isEmpty()) {
					return false;
				}
				if (st.peek()=='(') {
					st.pop();
				}
			}
		}
		
		if (st.isEmpty()) return true;
		else return false;
	}
}
