package stack.nextPreviousGreaterSmaller;
import java.util.Stack;
import stack.PrintArray;

public class NextGreater {
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
			if (!st.isEmpty() &&  ) {
				
			}
		}

		PrintArray.print(res);
	}
}
