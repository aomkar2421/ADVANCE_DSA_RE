package stack.nextPreviousGreaterSmaller;
import java.util.Stack;
import stack.PrintArray;

public class PreviousSmallerElementI {
	public static void main(String[] args) {
		int [] arr = {1,5,7,3,2,6,3,4};
		PrintArray.print(arr);
		solution(arr);
	}

	private static void solution(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int n = arr.length;
		int [] res = new int[n];

		for (int i = 0; i < res.length; i++) {

			while (!st.isEmpty() &&  arr[i]<=st.peek()) {
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = -1;
			}
			else if(!st.isEmpty() && arr[i]>st.peek() ) {
				res[i] = st.peek();
			}
			st.push(arr[i]);
		}

		PrintArray.print(res);
	}
}
