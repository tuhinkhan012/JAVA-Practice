/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.even.from.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            File f = new File("src/odd/even/from/file/data.txt");


            System.out.print("Total odd number found: ");

            List<Integer> list = new ArrayList<>();
            int i =0, cnt=0;
            try (Scanner scanner = new Scanner(f);) {
                while (scanner.hasNextInt()) {
                    list.add(scanner.nextInt());
                    if(list.get(i) % 2 != 0){
                        cnt++;
                    }
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Error found!");
            }
            // print out the list
            System.out.println(cnt);
            }
    
}
