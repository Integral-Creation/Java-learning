/*
Enums:
    (Enumerations) A special kind of class that represents a fixed set of constants.
    they improve code readability and are easy to maintain.
    more efficient with switches when comparing strings
*/

import java.util.Scanner;

enum Day{
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}
public class _01Enums {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the day of the Week");

        String response = scanner.nextLine().toUpperCase();
        scanner.close();

        try{
            Day day = Day.valueOf(response);
    
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Its a week day");
                case SATURDAY, SUNDAY -> System.out.println("It's is the weekend");
            }  
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Day");
        }
    }
}
