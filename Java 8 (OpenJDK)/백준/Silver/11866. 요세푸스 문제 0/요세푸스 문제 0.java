import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!q.isEmpty()) {
            // K-1명은 뒤로 보냄
            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }

            // K번째 사람 제거
            sb.append(q.poll());
            if (!q.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}