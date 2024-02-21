package Level_1;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String result = solution(n);

        System.out.println(""+result);
    }
    public static String solution(int n) {
        int i = 2;
        String result;
        if(n % i == 1) {
            result = "Odd";
        }
        else {
            result = "Even";
        }
        return result;
    }
}
