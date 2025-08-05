import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 666;
        int count =0;
        while (true){
            if (String.valueOf(a).contains("666")){
                count+=1;
            }
            if (count == N){
                System.out.println(a);
                break;
            }
            a++;
        }
    }
}