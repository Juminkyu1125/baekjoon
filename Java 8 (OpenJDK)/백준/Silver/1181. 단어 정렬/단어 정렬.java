import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        Set<String> s = new HashSet<>();
        int [] arr = new int[N];
        for (int i = 0; i<N; i++){
            s.add(scan.nextLine()); //중복제거를 위한 set 사용
        }
        List<String> list = new ArrayList<>(s);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                if (s1.length() != s2.length()){
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}