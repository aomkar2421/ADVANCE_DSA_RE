package stack;

import java.util.Stack;

public class RemoveConsecutiveSubsequnces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 4, 4, 5, 6, 6, 6, 6, 7, 8, 9, 9};
        solution(arr);
    }

    private static void solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || arr[i] != st.peek()) {
                st.push(arr[i]);
            } else if (i == n - 1 || arr[i] != arr[i + 1]) {
                st.pop();
            }
        }
        
        System.out.println(st);
    }
}
