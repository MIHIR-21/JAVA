/* Java program to illustrate the concept of multilevel inheritance */
import java.util.Scanner;

// Parent class
class a {
    int a ;
    void input () {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a :");
        a = sc.nextInt();
    }
}
class b extends a{
    int b ;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number b :");
        b = sc.nextInt();
    }
}
class c extends b {
    void add() {
        System.out.println("addition is :" + (a+b));
    }
}

// Driver class
public class Multilevel_Inheritance {
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        c obj = new c();
        obj.input();
        obj.getdata();
        obj.add();

    }    
}
