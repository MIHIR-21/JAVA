import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for loop
        int i = 1;
        System.out.print("example of for loop :");
        for ( i = 1; i <= 10; i++) {
            System.out.print(i);
        }

        System.out.println();
        // while loop
        int b = 1;
        System.out.print("example of while loop :");
        while (b <= 10) {
            System.out.print(b);
            // b = b + 1;
            b++;
        }

        System.out.println();
        // do-while loop
        int a = 1;
        System.out.print("example of do-while loop :");
        do {
            System.out.print(a);
            // a = a + 1;
            a++;
        } while (a <= 10);
        System.out.println();

    }
}
