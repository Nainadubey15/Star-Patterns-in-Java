import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // given integer N, print a square of N*N using *;
       Scanner sc = new Scanner(System.in);
        int N = 5; 
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
