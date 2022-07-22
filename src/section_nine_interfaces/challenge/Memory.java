package section_nine_interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

public class Memory implements ISaveable{

    private String time;
    private String place;
    private String event;

    public Memory(String time, String place, String event) {
        this.time = time;
        this.place = place;
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public List<String> write() {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(0, this.time);
        temp.add(1, this.place);
        temp.add(2, this.event);
        return temp;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() == 3) {
            this.time = savedValues.get(0);
            this.place = savedValues.get(1);
            this.event = savedValues.get(2);
        }
    }

    @Override
    public String toString() {
        return "Memory{" +
                "time='" + time + '\'' +
                ", place='" + place + '\'' +
                ", event='" + event + '\'' +
                '}';
    }
}
