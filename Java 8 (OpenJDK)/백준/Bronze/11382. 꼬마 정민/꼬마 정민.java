import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] arr = input.split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);
        long C = Long.parseLong(arr[2]);
        System.out.println(A + B + C);
        scan.close();
    }
}