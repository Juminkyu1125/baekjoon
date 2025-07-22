import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tresult = 0.0;
        double tgrade = 0.0;

        Map<String, Double> gm = new HashMap<>();
        gm.put("A+", 4.5);
        gm.put("A0", 4.0);
        gm.put("B+", 3.5);
        gm.put("B0", 3.0);
        gm.put("C+", 2.5);
        gm.put("C0", 2.0);
        gm.put("D+", 1.5);
        gm.put("D0", 1.0);
        gm.put("F", 0.0);

        for (int i = 0; i<20; i++){
            String sub = scan.next();
            double grade = scan.nextDouble();
            String credit = scan.next();

            if(!credit.equals("P")){
                tresult += grade*gm.get(credit);
                tgrade += grade;
            }
        }
        double result = tresult/tgrade;
        System.out.printf("%.6f\n", result);
    }
}