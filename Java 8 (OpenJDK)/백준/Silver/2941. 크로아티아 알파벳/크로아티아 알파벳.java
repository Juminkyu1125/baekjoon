import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] cro = {"c=","c-","dz=","d-","lj","nj",	"s=","z="};
        for (String s : cro){
            str = str.replace(s, "*");
        }
        System.out.println(str.length());
    }
}