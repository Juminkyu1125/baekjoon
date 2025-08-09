import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int sum = 0;
        while(N >=0){
            if(N%5==0) {
                System.out.println(sum+N/5);
                return ;
            }
            N -=3;
            sum ++;
        }
        System.out.println(-1);
    }
}