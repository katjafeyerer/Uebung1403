package EventOrdner;

import java.util.ArrayList;

public class EventKalender {
    private ArrayList<Event> events = new ArrayList<>();

    public EventKalender(ArrayList<Event> events) {
        this.events = events;
    }
    public void add(Event e){
        events.add(e);
    }
    public Event getByTitle(String title){
        for (Event e: events) {
            if(e.getTitle().equals(title)){
                return e;
            }
        }
        return null;
    }
    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> found = new ArrayList<>();
        for (Event e: events) {
            if(e.getOrt().equals(ort)){
                found.add(e);
            }
        }
    return found;
    }
    public ArrayList<Event> getByEintrittsPreis(double min, double max){
        ArrayList<Event> found = new ArrayList<>();
        for (Event e: events) {
            if(e.getEintrittspreis() > min && e.getEintrittspreis() < max){
                found.add(e);
            }
        }
        return found;
    }
    public double getAvgPreisByOrt(String ort){
        ArrayList<Event> found = getByOrt("Murfeld");
        double count = 0;
        double sum = 0;
        for (Event e: found) {
            sum += e.getEintrittspreis();
            count++;
        }

        return sum/count;
    }
}
