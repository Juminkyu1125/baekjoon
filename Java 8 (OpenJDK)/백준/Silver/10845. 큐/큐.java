import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        Queue<Integer> q = new ArrayDeque();
        int back = -1;
        for(int i = 0; i<N; i++){
            String[] s = bf.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    q.add(Integer.parseInt(s[1]));
                    back = Integer.parseInt(s[1]);
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? -1: q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1: 0).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty() ? -1 : back).append("\n");
                default:
                    break;
            }
        }
        System.out.println(sb);
        }
    }
