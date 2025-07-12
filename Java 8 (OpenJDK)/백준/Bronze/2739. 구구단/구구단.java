import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1;i<=9;i++){
            int sum = N*i;
            System.out.println(N+" * "+i+" = "+sum);
        }
    }
}