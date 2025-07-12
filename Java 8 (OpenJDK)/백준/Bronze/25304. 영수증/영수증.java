import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int result = 0;
        for (int i = 1; i<=N; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            result += a*b;
        }
        if (result==X){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}