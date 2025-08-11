import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String [] arrN = bf.readLine().split(" ");
        Map <Integer, Integer> map = new HashMap<>();
        for (String s : arrN){
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int M = Integer.parseInt(bf.readLine());
        String [] arrM = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : arrM){
            int num = Integer.parseInt(s);
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }
        System.out.println(sb);
    }
}