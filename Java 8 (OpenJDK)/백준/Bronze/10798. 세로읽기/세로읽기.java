import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [][] x = new char [5][];
        for(int i=0; i<5; i++){
            x[i] = scan.next().toCharArray();
        }
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if (j<x[i].length){
                    System.out.print(x[i][j]);
                }
            }
        }
    }
}