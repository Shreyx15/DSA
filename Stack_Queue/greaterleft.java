package com.company.Stack_Queue;
import java.util.Stack;
public class greaterleft {
    public static void main(String[] args) {
        int[] greaterLeft = prevGreater(new int[]{1, 3, 2, 4}, 4);
        for (int i = 0; i < greaterLeft.length; i++) {
            System.out.print(greaterLeft[i] + " ");
        }
    }

    private static int[] prevGreater(int[] nums, int n) {
        int[] leftGreater = new int[n];


        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() > nums[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                leftGreater[i] = st.peek();
            } else {
                leftGreater[i] = -1;
            }
            st.push(nums[i]);
        }

    return leftGreater;}
}
