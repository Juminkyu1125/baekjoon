import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String result = "";
        for (int i = 1 ; i<=T; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            result += "Case #"+i+": "+(A+B)+"\n";
        }
        System.out.println(result);
    }
}