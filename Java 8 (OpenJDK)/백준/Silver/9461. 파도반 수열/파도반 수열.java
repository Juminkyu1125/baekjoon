import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scan.nextInt();
        long [] dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;
        for (int i=4; i<101; i++){
            dp[i] = dp[i-2]+dp[i-3];
        }
        for(int i=0; i<T; i++){
            int a = scan.nextInt();
            sb.append(dp[a]+"\n");
        }
        System.out.println(sb);
    }
}