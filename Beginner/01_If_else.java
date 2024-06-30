// get 3 values from the user and find the largest one 

import java.util.Scanner;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for A :");
        int a = sc.nextInt();
        System.out.print("Enter value for B :");
        int b = sc.nextInt();
        System.out.print("Enter value for C : ");
        int c = sc.nextInt();

        if ( a > c ) {
            if (a > b ) {
                System.out.println("a is big ");
            } else {
                System.out.println("b is big");
            }
        } else {
            if (c > b ){
            System.out.println("c is big");

            }
            else {
                System.out.println("b is big");
            }
        }
    }  
}
