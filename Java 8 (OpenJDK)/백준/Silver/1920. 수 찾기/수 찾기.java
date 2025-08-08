import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] input = bf.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<N; i++){
            set.add(Integer.parseInt(input[i]));
        }
        int M = Integer.parseInt(bf.readLine());
        String[] target = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M; i++){
            int targe = Integer.parseInt(target[i]);
            if(set.contains(targe)){
                sb.append("1\n");
            }
            else sb.append("0\n");
        }
        System.out.println(sb);

    }
}