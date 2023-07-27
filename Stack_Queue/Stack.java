package com.company.Stack_Queue;
import com.company.Stack_Queue.CustomStack;
public class Stack {
    public static void main(String[] args) throws Exception {
        CustomStack st = new CustomStack(5);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);
        st.dynamicPush(1);

//        st.display();
//        System.out.println(st.pop());
//        System.out.println(st.push(3));
        st.display();
    }
}
