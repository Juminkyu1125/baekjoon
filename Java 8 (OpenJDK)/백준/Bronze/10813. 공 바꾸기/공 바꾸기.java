import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt(); 
        int [] arr = new int[N];
        for (int a = 0; a<N; a++){
            arr[a] = a+1;
        }
        for (int b = 0; b<M; b++){
            int i = scan.nextInt()-1;
            int j = scan.nextInt()-1;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int c=0; c<N; c++){
            System.out.print(arr[c]+ " ");
        }
    }
}