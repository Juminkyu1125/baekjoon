import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [] a = new int[N];
        for (int i = 0; i<M; i++){
            int b = scan.nextInt();
            int c =scan.nextInt();
            int d = scan.nextInt();
            for (int j=b-1; j<c; j++){
                a[j] = d;
            }
        }
        for (int k = 0; k<N; k++){
            System.out.print(a[k]+" ");
        }
        
    }
}