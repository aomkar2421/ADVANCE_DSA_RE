package stack.collegeWallah;
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

		for (int i=n-1; i>=0; i--) {
			while (st.size()>0 && st.peek()<=arr[i]) {  // use <= insted of < as it ensures that all elements smaller than or equal to arr[i] are removed, as they can't be the next greater element.
				st.pop();
			}
			if (st.size()==0) {
				res[i] = -1;
			}else {
				res[i] = st.peek();
			}
			st.push(arr[i]);
		}

		PrintArray.print(res);
	}
}
