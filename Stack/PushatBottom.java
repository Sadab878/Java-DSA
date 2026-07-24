package Stack;

import java.util.Stack;

public class PushatBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        int ele = 50;
        pushAtBottom(st,ele);
        System.out.println(st);
        
        reverse(st);
        System.out.println(st);
    
    

    }
    private static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);

    }
    public static void pushAtBottom(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
        } 
        else {
            int top = st.pop();
            pushAtBottom(st, ele);
            st.push(top);
        }
    }
}
