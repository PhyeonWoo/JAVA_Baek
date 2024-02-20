package Level_1;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        for(int i = 1; i<=n; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
