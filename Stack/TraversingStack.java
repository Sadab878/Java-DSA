package Stack;

import java.util.Stack;

public class TraversingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            int top = st.pop();
            System.out.println(top);
            st2.push(top);
            
        }
        System.out.println(st2);
        while(st2.size()>0){
            int top = st2.pop();
            st.push(top);
        }
        System.out.println(st);
    }
}
