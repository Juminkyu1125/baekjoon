import java.util.*;
import java.io.*;
class Main{ //시간제한이 걸려있기에 읽기에 빠른 bufferreader 와 문자열로 만들어주어서 추가해주었다
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int [] arr = new int[N];
        for (int i = 0; i<N; i++){
           arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}