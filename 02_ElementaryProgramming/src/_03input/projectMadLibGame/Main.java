package _03input.projectMadLibGame;

import java.util.Scanner;
public class Main {
    public static void main(){
        // MAD LIB GAME
        Scanner scanner = new Scanner(System.in);

        String adjective01;
        String noun01;
        String adjective02;
        String verb01;
        String adjective03;

        System.out.print("Enter an adjective(description)");
        adjective01 = scanner.nextLine();
        System.out.print("Enter a noun(animal or person)");
        noun01 = scanner.nextLine();
        System.out.print("Enter an adjective(description)");
        adjective02 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing(action)");
        verb01 = scanner.nextLine();
        System.out.print("Enter an adjective(description)");
        adjective03 = scanner.nextLine();

        System.out.println("\nToday I went to a "+ adjective01+ " zoo.");
        System.out.println("In a exhibit, I saw a "+ noun01+".");
        System.out.println(noun01+" was "+ adjective02+ " and "+ verb01 + "!");
        System.out.println("I was "+ adjective03+"!");

        scanner.close();

    }
}
