import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for( int i=M; i<=N; i++){
            if (isprime(i)){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static boolean isprime(int i){
        if (i<2) return false;
        for (int j =2; j*j<=i; j++){
            if(i%j==0) return false;
        }
        return true;
    }
}