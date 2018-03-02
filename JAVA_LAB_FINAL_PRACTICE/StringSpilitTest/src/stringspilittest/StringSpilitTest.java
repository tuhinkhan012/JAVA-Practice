package stringspilittest;

import java.util.Scanner;

public class StringSpilitTest {

    private static int s;

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        String number = input.nextLine();

        Info(number);
    }

    private static void Info(String number) {
        String[] splitVal = number.split("");   //split method

        int id, semester, dig1, dig2, dig3, dig4;
        id = Integer.parseInt(splitVal[3]);      //spilit and array converted to int
        semester = Integer.parseInt(splitVal[4]);
        dig1 = Integer.parseInt(splitVal[9]);
        dig2 = Integer.parseInt(splitVal[10]);
        dig3 = Integer.parseInt(splitVal[11]);
        dig4 = Integer.parseInt(splitVal[12]);
        for (int i = 0; i <= 9; i++) {
            if (id == i) {
                switch (semester) {
                    case 0:
                        System.out.println("The student admitted in SPRING\nYear: 201" + i + " and Last four Digits of the student's ID is:\n" + dig1 + dig2 + dig3 + dig4);
                        break;
                    case 1:
                        System.out.println("The student admitted in SUMMER\nYear: 201" + i + " and Last four Digits of the student's ID is:\n" + dig1 + dig2 + dig3 + dig4);
                        break;
                    case 2:
                        System.out.println("The student admitted in FALL\nYear: 201" + i + " and Last four Digits of the student's ID is:\n" + dig1 + dig2 + dig3 + dig4);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
