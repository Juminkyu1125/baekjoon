import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i]=scan.nextInt()%42;
        }
        Arrays.sort(arr);
        int count = 1;
        
        for (int j=0; j<9; j++){
            if(arr[j]!=arr[j+1]){
                count ++;
            }
        }
         System.out.print(count);
        }
    }