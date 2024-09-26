package stack.collegeWallah;

import java.util.Stack;

public class NumberOfBracketsToMakeBalance2 {
	public static void main(String[] args) {
		String str = "())))()())()";
		System.out.println(isBalanced(str));
	}

	private static int isBalanced(String str) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar == '(') {
				st.push(currentChar);
			} else {
				if (!st.isEmpty() && st.peek() == '(') {
					st.pop();
				} else {
					st.push(currentChar);
				}
			}
		}

		return st.size();
	}
}
