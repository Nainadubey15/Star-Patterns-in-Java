import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nst = 1;
        int N = 3;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }
        sc.close();
    }
}
