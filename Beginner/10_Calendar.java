// create a new calendar object and print the current year, month, and day
import java.util.*;
public class calendar {
    public static void main(String[] args) {
    
        // print the current year, month, day
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getClass());
        System.out.println("year => " + cal.get(Calendar.YEAR));
        System.out.println("month => " + cal.get(Calendar.MONTH));
        System.err.println("Day => " + cal.get(Calendar.DAY_OF_MONTH));

        // add 2 years to current year
        cal.add(Calendar.YEAR, 2);
        int a = cal.get(Calendar.YEAR);
        System.out.println("a : " + a);
    }
}
