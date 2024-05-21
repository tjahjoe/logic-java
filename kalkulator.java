import java.lang.reflect.Method;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kondisi = true;
        int a, b;
        int result = 0;
        char operator;
        a = sc.nextInt();
        while (kondisi) { 
            operator = sc.next().charAt(0);
            b = sc.nextInt();
            switch (operator) {
                case '+':
                    result += (a + b);
                    System.out.println(result);
                    a = 0;
                    break;
            
                default:
                    break;
            }
        }
    }
}
