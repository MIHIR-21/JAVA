// get one value from the use and find that the value is even or odd 

import java.util.Scanner;
public class evenodd {
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a :");
        int a = sc.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("a is even");
        }
        else {
            System.out.println("a is odd");
        }
    }
}
