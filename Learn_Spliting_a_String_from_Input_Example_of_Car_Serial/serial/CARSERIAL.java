package car.serial;

import java.util.Scanner;

/**
 *
 * @MD Shibli Mollah
 */
public class CARSERIAL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carNumber = input.nextLine();         //The Input should be like this "DHAKA-Metro-Ga-12-1234" 

        numberPlate(carNumber);
    }

    static void numberPlate(String carNumber) {
        String[] parseValue;
        parseValue = carNumber.split("-");               //Spliting the value with "-"                                                            
        String area = parseValue[0];                  //We can create method and the call them inside of it to get the answer
        String areaType = parseValue[1];              //We can create method and the call them inside of it to get the answer
        // System.out.println("" + parseValue[3]);
        // System.out.println("" + parseValue[4]); 
        String type = parseValue[2];
        System.err.println("The Type of the Vehicle is: " + vhType(type)); //Calling the Method to find out the Type and printing out
    }

    static String vhType(String value) {
        switch (value) {
            case "Ka":
                return "Car\n Engine: 500CC";
            case "Kha":
                return "Car\n Engine: 500-800CC";
            case "Ga":
                return "Car\n Engine: 800-1300CC";
            case "Gha":
                return "Car\n Engine: 1300+CC";
            case "Ha":
                return "Honda\n Engine: 135CC";
            case "La":
                return "Car\n Engine: 150CC";
            case "Ba":
                return "Bus\n Engine: 00CC";
            case "Ta":
                return "Truck\n Engine: 00CC";
            default:
                return "No type found";
        }
    }
}
