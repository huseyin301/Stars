package Stars;
import java.util.Scanner;
public class cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, tN, c = 1, z = 1;

        System.out.print("Sayı giriniz : ");
        n = sc.nextInt();

        tN = n;

        for (int i = 1; i <= n; i++){

            for (int x = 1; x <= (n - i); x++){

                System.out.print(" ");

            }

            for (int y = 1; y <= (2 * i) - 1; y++){

                System.out.print("*");

            }

            System.out.println();

        }

        tN--;

        for (int i = 1; i <= tN; i++){

            for (int x = 1; i >= c; x++){

                System.out.print(" ");
            c++;
            }

            c = 1;

            for (int y = 1; y <= (tN * 2) - z; y++){

                System.out.print("*");

            }

            z += 2;

            System.out.println();

        }

    }
}
