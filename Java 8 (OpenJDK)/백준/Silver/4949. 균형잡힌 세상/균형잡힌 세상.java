import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String s = scan.nextLine();
            if (s.equals(".")) break;
            Stack<Character> st = new Stack<>();
            boolean ok = true;
            for (char ch : s.toCharArray()){
                if (ch == '('|| ch =='['){
                    st.push(ch);
                }
                else if (ch==')'){
                    if (st.isEmpty()||st.peek() !='('){
                        ok = false;
                        break;
                    }
                    st.pop();
                }
                else if (ch == ']'){
                    if (st.isEmpty()||st.peek() !='['){
                        ok = false;
                        break;
                    }
                    st.pop();
                }
            }
            if(!st.isEmpty()) ok = false;
            System.out.println(ok ? "yes" : "no");
        }
    }
}