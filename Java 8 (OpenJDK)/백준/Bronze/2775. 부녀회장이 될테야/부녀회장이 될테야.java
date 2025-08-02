import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i<T; i++){
            int k = scan.nextInt();
            int n = scan.nextInt();
            int [] [] arr = new int[k+1][n+1];
            for(int j = 1; j<=n; j++){
                arr[0][j] = j;
            }
            for(int a = 1; a<=k; a++){
                for(int b=1; b<=n; b++){
                    arr[a][b] = arr[a][b-1]+arr[a-1][b];
                }
            }
            System.out.println(arr[k][n]);
        }
    }
}