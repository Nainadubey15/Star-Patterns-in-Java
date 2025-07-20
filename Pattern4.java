import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nst = 1;
        int n = 5;
        int nsp = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                nst = nst + 2;
                nsp--;
            } else {
                nst = nst - 2;
                nsp++;
            }
            System.out.println();
        }
        sc.close();
    }

}
