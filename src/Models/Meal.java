package Models;
import java.time.*;

/**
 * Class to model a meal
 *
 * @author Jake Shepherd
 */

public class Meal {

    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean setTimes;

    // Class constructors
    public Meal(String name, LocalTime startTime, LocalTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.setTimes = true;
    }

    public Meal(String name) {
        this.name = name;
    }

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean isSetTimes() {
        return setTimes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setSetTimes(boolean setTimes) {
        this.setTimes = setTimes;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", setTimes=" + setTimes +
                '}';
    }
}
