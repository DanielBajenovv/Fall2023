/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan and danielbajenov
 */

public enum Weekdays {
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY, 
    SUNDAY;

    public void printDayName() {
        String formattedName = this.name().charAt(0) + this.name().substring(1).toLowerCase();
        System.out.println(formattedName);
    }
}