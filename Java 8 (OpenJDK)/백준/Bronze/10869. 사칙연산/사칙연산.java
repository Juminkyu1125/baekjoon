import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int plus = A+B;
        System.out.println(plus);
        int m = A-B;
        int x = A*B;
        int d = A/B;
        int n = A%B;
        System.out.println(m);
        System.out.println(x);
        System.out.println(d);
        System.out.println(n);
    }
}