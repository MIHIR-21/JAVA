// get input of two D arry from the user and print it 

import java.util.*;
public class tDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input rows & columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter value of arr [" + i + "]  [" + j + "] :");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // print rows & columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("numbers[" + i + "][" + j + "] = " + numbers[i][j]);
            }
        }
    }
}
