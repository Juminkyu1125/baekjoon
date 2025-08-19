import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum +=arr[i];
        }
        sb.append(Math.round((double)sum/n)).append("\n");
        Arrays.sort(arr);
        sb.append(arr[n/2]).append("\n");
        Map<Integer, Integer> map = new HashMap<>();
        int many = 0;
        for (int a : arr){
            int freq = map.getOrDefault(a,0)+1;
            map.put(a, freq);
            many = Math.max(freq, many);
        }
        List<Integer> list = new ArrayList<>();
        for (int key: map.keySet()){
            if (map.get(key)==many){
                list.add(key);
            }
        }
        Collections.sort(list);
        if(list.size()>1){
            sb.append(list.get(1)).append("\n");
        }
        else sb.append(list.get(0)).append("\n");
        sb.append(arr[n-1]-arr[0]).append("\n");
        System.out.println(sb);
    }

}