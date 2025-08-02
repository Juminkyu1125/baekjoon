import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count =1;
        int range =1;
        while(n>range){
            range += count*6;
            count++;
        }
        System.out.println(count);
    }
}