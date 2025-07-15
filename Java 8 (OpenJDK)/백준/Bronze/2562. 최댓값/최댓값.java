import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] a = new int[9];
        for (int i=0; i<9; i++){
            a[i] = scan.nextInt();
        }
        int max = a[0];
        int maxn = 0;
        for (int j=0; j<9; j++){
            if (a[j]>max){
                max=a[j];
                maxn = j;
            }
        }
        System.out.println(max);
        System.out.println(maxn+1);
    }
}