// Java program to illustrate the
// concept of single inheritance
import java.util.*;

// Parent class
class One {
    public void print_hello(){

        System.out.println("hello");
    }
}

class Two extends One {
    public void print_welcome() { 
        System.out.println("welcome !"); 
    }
}

// Driver class
public class Main {
      // Main function
    public static void main(String[] args){

        Two g = new Two();
        g.print_hello();
        g.print_welcome();
    }
}
