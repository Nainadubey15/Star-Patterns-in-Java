import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int nst = 1;
        int count = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(count);
                count++;
            }
            nst++;
            System.out.println();
        }
        sc.close();
    }
}
