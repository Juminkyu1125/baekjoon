import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int [] bj = new int[N];
        for(int i = 0; i<N; i++){
            bj[i] = scan.nextInt();
        }
        int max = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = bj[i]+bj[j]+bj[k];
                    if (sum<=M&&sum>max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}