import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();
        String result = Integer.toString(N,B).toUpperCase();
        System.out.println(result);
        scan.close();
    }
}