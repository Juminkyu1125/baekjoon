import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for (int j = 0; j<N; j++){
            if (arr[j]>max){
                max = arr[j];
            }
        }
        double sum = 0;
        for (int k=0; k<N; k++){
            sum += (double) arr[k] / max * 100;
        } 
        System.out.println((double)sum/arr.length);

    }
}