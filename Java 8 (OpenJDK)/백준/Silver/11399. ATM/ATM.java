import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        int num = 0;
        int [] arr = new int[N];
        for (int i = 0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i =0; i<N; i++){
            num +=arr[i];
            sum += num;
        }
        System.out.println(sum);
    }
}