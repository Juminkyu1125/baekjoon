import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        scan.nextLine();
        long ar = 0;
        String charr = scan.nextLine();
        for (int i=0; i<L; i++){
            int num = charr.charAt(i)-'a'+1;
            ar += num*(long)Math.pow(31,i);
        }
        System.out.print(ar);
    }
}