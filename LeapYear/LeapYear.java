package leapyear;

import java.util.Scanner;

/**
 *
 * @author MD Shibli Mollah
 */
public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner s = new Scanner(System.in);

        year = s.nextInt();
        int div, div1, div2;
        div = year % 400;
        div1 = year % 100;
        div2 = year % 4;

        if ((div == 0) || (div1 != 0 && div2 == 0)) {
            System.err.println(year + " is a Leap Year.");
        } else {
            System.err.println("This year is not a Leap Year");
        }
    }
}
