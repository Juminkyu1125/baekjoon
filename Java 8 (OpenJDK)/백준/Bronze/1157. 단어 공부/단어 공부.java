import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase(); //대문자로 바꿔주기
        int [] arr = new int[26];
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch-'A']++;
        }
        int max= 0;
        char result = '?';
        for (int i=0; i<26; i++){
            if (arr[i]>max){
                max = arr[i];
                result = (char)(i+'A');
        }
            else if (arr[i]==max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}