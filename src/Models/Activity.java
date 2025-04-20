package Models;
import java.time.*;

/**
 * Class to model an activity
 *
 * @author Jake Shepherd
 */

public class Activity {

    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean setTimes;

    // Class Constructors
    public Activity(String name, LocalTime startTime, LocalTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.setTimes = true;
    }

    public Activity(String name) {
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

    public boolean isSetTime() {
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

    public void setSetTime(boolean setTime) {
        this.setTimes = setTime;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", setTime=" + setTimes +
                '}';
    }
}
