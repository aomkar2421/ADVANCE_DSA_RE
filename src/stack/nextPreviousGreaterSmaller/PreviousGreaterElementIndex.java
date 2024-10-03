package stack.nextPreviousGreaterSmaller;
import java.util.Stack;
import stack.PrintArray;

public class PreviousGreaterElementIndex {
	public static void main(String[] args) {
		int [] arr = {9,5,7,3,2,6,3,4};
		PrintArray.print(arr);
		solution(arr);
	}

	private static void solution(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int n = arr.length;
		int [] res = new int[n];

		for (int i = 0; i < res.length; i++) {

			while (!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = -1;
			}
			else if (arr[st.peek()]>arr[i]) {
				res[i] = st.peek();
			}
			st.push(i);
			
		}
		PrintArray.print(res);
	}
}
