import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st =new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> hash = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            hash.add(bf.readLine());
        }
        int count = 0;
        for(int i=0; i<M; i++){
            String s = bf.readLine();
            if(hash.contains(s)){
                count++;
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)+"\n");
        }
        System.out.println(sb);
    }
}