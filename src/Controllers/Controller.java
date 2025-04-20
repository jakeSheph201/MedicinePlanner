package Controllers;

import View.Calender;
import View.Events;
import View.LoadingPage;

import java.util.ArrayList;

/**
 * Controller class
 */

public class Controller {

    private LoadingPage loadingPage = new LoadingPage();
    private Events events = new Events();
    private Calender calender = new Calender();
    ArrayList<Object> allEvents = new ArrayList<>();

    // Application welcome loading screen
    public void start() {
        loadingPage.displayIntroduction();
        mainMenu();
    }

    // Main menu controller
    public void mainMenu() {
        String option = loadingPage.displayMainMenu();
        switch (option) {
            case "A":
                System.out.print("Add Event");
                addEvent();
                break;
            case "Q":
                System.exit(0);
                break;
            case "C":
                System.out.println("Create Calender");
                calender.createCalender(allEvents);
                break;
            default:
                System.out.println("MUST ENTER A VALID INPUT");
                System.out.println("VALID INPUTS = 'A' - 'E' - 'C'");
                mainMenu();
        }
    }

    // Add event controller
    public void addEvent() {
        String option = events.addEventMenu();
        ArrayList<Object> event = events.addEventProcess(option);
        allEvents.add(event.get(0));
        System.out.println(allEvents);
        mainMenu();
    }
}
