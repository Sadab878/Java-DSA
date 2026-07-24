package Stack;

import java.util.Stack;

public class BasicSTLofStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Areeb");
        st.push("Asim");
        st.push("Rounak");
        st.push("Dada");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
            
          
    }
}
