package stack.collegeWallah;
import java.util.Stack;
import stack.PrintArray;

public class StockSpan {
	public static void main(String[] args) {
		int [] arr = { 10, 4, 5, 90, 120, 80 };
		PrintArray.print(arr);
		solution(arr);
	}

	private static void solution(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int n = arr.length;
		int [] res = new int[n];
		
		res[0] = 1;
		st.push(0);
		
		for (int i = 1; i < n; i++) {
			while ( !st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}

			res[i] = st.isEmpty() ? i+1 : i-st.peek();
			st.push(i);
 
		}

		PrintArray.print(res);
	}
}
