package stack.collegeWallah;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String str = "([{]})";
		System.out.println(isBalanced(str));
	}

	private static boolean isBalanced(String str) {

		Stack<Character> st = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			char curChar = str.charAt(i);
			
			if (curChar=='(' || curChar=='[' || curChar=='{' ) {
				st.push(curChar);
			}else {
				if (st.isEmpty()) {
					return false;
				}
				char top = st.peek();
				if (top=='(' && curChar==')'  ||  top=='[' && curChar==']'  ||  top=='{' && curChar=='}' ) {
					st.pop();
				}else {
					return false;
				}
			}
		}
		
		if (st.isEmpty()) return true;
		else return false;
	}
}
