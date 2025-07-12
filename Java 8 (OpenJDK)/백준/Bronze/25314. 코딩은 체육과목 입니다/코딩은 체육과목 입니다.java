import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = N/4;
        for (int j =1; j<=i; j++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}