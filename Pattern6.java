import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5;
        int nst = n / 2 + 1;
        int nsp = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(count);
                count++;
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= nst; l++) {
                System.out.print(count);
                count++;
            }
            if (i <= n / 2) {
                nst--;
                nsp = nsp + 2;
            } else {
                nst++;
                nsp = nsp - 2;
            }
            System.out.println();
        }

        scn.close();

    }
}