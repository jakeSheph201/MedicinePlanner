package View;
import java.io.*;
import java.util.Scanner;

/**
 * Class to display loading page screens
 */

public class LoadingPage {

    Scanner s = new Scanner(System.in);

    // Application welcome display method
    public void displayIntroduction() {
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("WELCOME TO THE APPLICATION");
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        String con = s.nextLine();
    }

    // Main menu display method
    public String displayMainMenu() {
        System.out.println("=".repeat(50));
        System.out.println("MAIN MENU");
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("PLEASE SELECT AN OPTION");
        System.out.println("A - Add Event");
        System.out.println("C - Create Calender");
        System.out.println("Q - Exit Application");
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("YOUR OPTION: ");
        String option = s.nextLine();
        return option.toUpperCase();

    }
}
