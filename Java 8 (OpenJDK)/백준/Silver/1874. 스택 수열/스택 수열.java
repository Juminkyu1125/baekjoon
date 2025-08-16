import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int [] target = new int[n];
        int next = 1;
        int index = 0;
        for(int i = 0; i<n; i++){
            target[i] = Integer.parseInt(bf.readLine());
        }
        while(index<n){
            if (next<=target[index]){
                st.push(next++);
                sb.append("+\n");
            }
            while(!st.isEmpty() && st.peek() == target[index]){
                st.pop();
                sb.append("-\n");
                index ++;
            }
            if (!st.isEmpty() &&st.peek()>target[index]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}