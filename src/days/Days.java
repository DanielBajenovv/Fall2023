
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan and danielbajenov
 jn 22nd
 */
public class Days {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week:");

        for (Weekdays day : Weekdays.values()) {
            day.printDayName();
        }
    }
}
