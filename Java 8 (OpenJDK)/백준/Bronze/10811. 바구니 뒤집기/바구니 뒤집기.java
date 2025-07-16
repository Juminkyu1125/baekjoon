import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [] arr = new int[N];
        for (int p = 0; p<N; p++){
            arr[p]=p+1;
        }
        for (int i=0; i<M; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            while(a<b){
                int tmp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = tmp;
                a++;
                b--;
            }
        }
        for (int k = 0; k<N; k++){
            System.out.print(arr[k]+" ");
        }
    }
}