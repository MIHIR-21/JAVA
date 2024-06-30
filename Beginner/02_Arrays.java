import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i=0; i<size; i++){
            System.out.print("enter number " + (i+1) + " : ");  // start from 1 to size of array
            number[i] = sc.nextInt();
        }
            System.out.println();
            System.out.print("enter x : "); //enter the value that you want to find
            int x = sc.nextInt();

        for (int i=0; i<size; i++ ) {
            if ( number[i] == x){
                System.out.println("x is found at index: " + i);
            }
        }       
    } 
}
