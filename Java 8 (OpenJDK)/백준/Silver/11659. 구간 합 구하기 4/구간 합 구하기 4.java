import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫 줄 입력: N, M
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 두 번째 줄 입력: 배열
        int[] arr = new int[N + 1];        // 1-based index
        int[] prefixSum = new int[N + 1];  // 누적합 저장용
        st = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + arr[i]; // 누적합 계산
        }

        // M개의 쿼리 처리
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(prefixSum[j] - prefixSum[i - 1]).append("\n");
        }

        System.out.println(sb);
    }
}