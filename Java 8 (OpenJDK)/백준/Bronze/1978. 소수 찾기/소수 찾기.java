import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        for (int i= 0; i<N; i++){
            int k = scan.nextInt();
            if (k>=2){
                int j ;
                for (j=2; j<=Math.sqrt(k); j++){
                    if (k%j ==0 ) break;
                }
                if (j>Math.sqrt(k)) count++;
            }
        }
        System.out.println(count);
    }
}