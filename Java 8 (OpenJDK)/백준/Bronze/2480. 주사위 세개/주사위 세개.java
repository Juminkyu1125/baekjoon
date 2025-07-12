import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int price = 0;
        if (a>0&&a<=6&&b>0&&b<7&&c>0&&c<7){
            if (a==b&& b==c && a==c){
                price = 10000+(a*1000);
            }
            else if (a==b || b==c ||a==c){
                if (a==b){
                    price = 1000+(b*100);
                }
                else if (b==c){
                    price = 1000+(c*100);
                }
                else if (a==c){
                    price=1000+(a*100);
                }
            }
            else {
                if (a>b && a>c){
                    price = a*100;
                }
                if (b>a && b>c){
                    price = b*100;
                }
                if (c>a&&c>b){
                    price = c*100;
                }
            }
        }
        System.out.println(price);
    }
}