import java.util.Scanner;
class Main{
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int a = N-K;
    int Nsum = 1;
    for (int i=1; i<=N; i++){
        Nsum *= i;
    }
    int Ksum = 1;
    for (int i=1; i<=K; i++){
        Ksum *= i;
    }
    int asum = 1;
    for (int i =1; i<=a; i++){
        asum *=i;
    }
    System.out.println(Nsum/(Ksum*asum));
    }

}