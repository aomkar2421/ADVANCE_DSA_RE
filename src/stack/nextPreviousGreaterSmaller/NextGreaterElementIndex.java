package stack.nextPreviousGreaterSmaller;
import java.util.Stack;
import stack.PrintArray;

public class NextGreaterElementIndex {
	public static void main(String[] args) {
		int [] arr = {1,5,2,3,1,6,3,4};
		PrintArray.print(arr);
		solution(arr);
	}

	private static void solution(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int n = arr.length;
		int [] res = new int[n];

		for (int i = n-1; i >= 0; i--) {

			while (st.size()>0 && arr[st.peek()]<arr[i]) {
				st.pop();
			}
			if (st.isEmpty() ) {
				res[i] = -1;
			}
			else if (arr[st.peek()]>arr[i]) {
//				if you want element insert below
				res[i] = arr[st.peek()];
				
//				if you want index instead of element just insert follwing
//				res[i] = arr[st.peek()];
			}
			st.push(i);
		}

		PrintArray.print(res);
	}
}
