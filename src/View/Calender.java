package View;

import Models.Activity;
import Models.Meal;
import Models.Medicine;

import java.util.ArrayList;

public class Calender {
    String[][][][] calenderArray = new String[23][23][23][23];

    public void createCalender(ArrayList<Object> eventsList) {
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println("Creating Calender");
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        sortItems(eventsList);
    }

    public void sortItems(ArrayList<Object> eventsList) {
        ArrayList<Object> setTimes = new ArrayList<>();
        ArrayList<Object> unspecifiedTimes = new ArrayList<>();
        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        for (int i=0;i<=eventsList.size()-1;i++) {
            if(eventsList.get(i) instanceof Activity activity) {
                if (activity.isSetTime()) {
                    setTimes.add(activity);
                }else {
                    unspecifiedTimes.add(activity);
                }
            }else if (eventsList.get(i) instanceof Medicine medicine) {
                if (medicine.getSetTimes()) {
                    setTimes.add(medicine);
                }else {
                    unspecifiedTimes.add(medicine);
                }
            }else if(eventsList.get(i) instanceof Meal meal) {
                if (meal.getStartTime() != null) {
                    setTimes.add(meal);
                }else {
                    unspecifiedTimes.add(meal);
                }
            }
        }
        sortSetTimes(setTimes);
        sortRest(unspecifiedTimes);
    }

    public void sortSetTimes(ArrayList<Object> setEvents) {

    }

    public void sortRest(ArrayList<Object> unspecifiedTimes) {

    }
}
