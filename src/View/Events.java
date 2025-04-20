package View;

import Models.Activity;
import Models.Meal;
import Models.Medicine;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Events {

    Scanner s = new Scanner(System.in);

    // Add Event display method
    public String addEventMenu() {

        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("ADD EVENT");
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("PLEASE SELECT AN OPTION");
        System.out.println("A - Add Activity Event");
        System.out.println("M - Add medicine Event");
        System.out.println("F  -Add Meal Event");
        System.out.println("Q - return to main menu");
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        String option = s.nextLine();
        return option.toUpperCase();
    }

    public ArrayList<Object> addEventProcess(String option) {
        ArrayList<Object> arr = new ArrayList<Object>();
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));

        switch (option) {
            case "A":
                Activity activity = addActivityDisplay();
                arr.add(activity);
                break;
            case "M":
                Medicine medicine = addMedicineDisplay();
                arr.add(medicine);
                break;
            case "F":
                Meal meal = addMealDisplay();
                arr.add(meal);
                break;
        }
        return arr;
    }

    /**
     * Display method for adding an activity
     *
     * Vars = Name, start time(optional), end time(optional)
     *
     * @return Activity activity
     */
    public Activity addActivityDisplay() {
        Activity activity;

        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("Enter Activity Name");
        String activityName = s.nextLine().toUpperCase();
        System.out.println("Does this activity have a set time?");
        String yesNo = s.nextLine().toUpperCase();
        if (yesNo.equals("YES")) {
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            System.out.println("Enter Start Time (HH:MM:SS)");
            String startTime = s.nextLine();
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            System.out.println("Enter End Time (HH:MM:SS)");
            String endTime = s.nextLine();
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            LocalTime sTime = LocalTime.parse(startTime);
            LocalTime eTime = LocalTime.parse(endTime);
            activity = new Activity(activityName, sTime, eTime);
        }
        else {
            activity = new Activity(activityName);
        }
        return activity;
    }

    /**
     * Display method for adding a medicine
     *
     * Vars = name, recurring times(optional), specific times array(optional)
     *
     * @return Medicine medicine
     */

    public Medicine addMedicineDisplay() {
        Medicine medicine;
        LocalTime[] specificTimes = new LocalTime[100];

        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("Enter Medicine Name");
        String medicineName = s.nextLine().toUpperCase();
        System.out.println("Does this medicine have recurring times?");
        String yesNo = s.nextLine().toUpperCase();
        if (yesNo.equals("YES")) {
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            System.out.println("Please enter number of times medicine is taken");
            int recurring = s.nextInt();
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            System.out.println("Does this medicine have specific timings?");
            String yesNo2 = s.nextLine()+s.nextLine().toUpperCase();
            if (yesNo2.equals("YES")) {
                System.out.println("Please enter specific times (HH:MM:SS)");
                for (int i=0; i<=recurring-1; i++) {
                    System.out.println("=".repeat(50));
                    System.out.println("=".repeat(50));
                    String time = s.nextLine();
                        LocalTime t = LocalTime.parse(time);
                        specificTimes[i] = t;
                }
                medicine = new Medicine(medicineName, recurring, specificTimes);
            }
            else {
                medicine = new Medicine(medicineName, recurring);
            }
        }
        else {
            medicine = new Medicine(medicineName);
        }
        return medicine;
    }


    /**
     * Display method for adding a meal
     *
     * vars = name, start time(optional), end time(optional)
     *
     * @return Meal meal
     */

    public Meal addMealDisplay() {
        Meal meal;

        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("Enter Meal Name");
        String activityName = s.nextLine().toUpperCase();
        System.out.println("Does this meal have a set time?");
        String yesNo = s.nextLine().toUpperCase();
        if (yesNo.equals("YES")) {
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            System.out.println("Enter Start Time (HH:MM:SS)");
            String startTime = s.nextLine();
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            System.out.println("Enter End Time (HH:MM:SS)");
            String endTime = s.nextLine();
            System.out.println("=".repeat(50));
            System.out.println("=".repeat(50));
            LocalTime sTime = LocalTime.parse(startTime);
            LocalTime eTime = LocalTime.parse(endTime);
            meal = new Meal(activityName, sTime, eTime);
        }
        else {
            meal = new Meal(activityName);
        }
        return meal;
     }


}
