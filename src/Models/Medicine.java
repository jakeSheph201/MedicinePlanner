package Models;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class to model medicine
 *
 * @author Jake Shepherd
 */

public class Medicine {

    private String name;
    private int recurring;
    private LocalTime[] specificTimes;
    private boolean setTimes;

    // Constructors for medicine class
    public Medicine(String name, int recurring, LocalTime[] times) {
        this.name = name;
        this.recurring = recurring;
        this.specificTimes = times;
        this.setTimes = true;
    }

    public Medicine(String name, int recurring) {
        this.name = name;
        this.recurring = recurring;
    }

    public Medicine(String medicineName) {
        this.name = medicineName;
    }

    // Getters and Setter methods

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public int getRecurring() { return this.recurring; }

    public void setRecurring(int recurring) { this.recurring = recurring; }

    public LocalTime[] getSpecificTimes() { return this.specificTimes; }

    public void setSpecificTimes(LocalTime times[]) { this.specificTimes = times; }

    public boolean getSetTimes() { return this.setTimes; }

    public void setSetTimes(boolean setTimes) { this.setTimes = setTimes; }
    // toString


    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", recurring=" + recurring +
                ", specificTimes=" + Arrays.toString(specificTimes) +
                ", setTimes=" + setTimes +
                '}';
    }
}
