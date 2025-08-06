import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int [][] arr = new int[N][2];
        for (int i = 0; i<N; i++){
            String [] input = bf.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare (int[] a, int[] b){
                if (a[0] != b[0]) return a[0]-b[0]; //x 오름차순 정렬
                return a[1]-b[1]; //y 오름차순 정렬
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}