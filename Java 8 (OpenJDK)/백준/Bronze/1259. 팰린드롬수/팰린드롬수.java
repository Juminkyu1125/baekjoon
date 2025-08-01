
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String n = scan.next();
            if(n.equals("0")) break;
            int pl[] = new int[n.length()];
            for (int i=0; i<n.length(); i++){
                pl[i] = n.charAt(i)-'0';
            }
            int ne[] = new int[pl.length];
            for (int i=0; i<pl.length; i++){
                ne[i] = pl[pl.length-1-i];
            }
            if (Arrays.equals(ne,pl)){
                System.out.println("yes");
            }
            else System.out.println("no");
        
    }
}
}