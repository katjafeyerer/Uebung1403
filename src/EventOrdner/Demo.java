package EventOrdner;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Event e1 = new Event("Event1", "Murfeld", 25);
        Event e2 = new Event("Event2", "Murfeld", 25);
        Event e3 = new Event("Event3", "Graz", 50);
        Event e4 = new Event("Event4", "Grambach", 75);

        ArrayList<Event> list = new ArrayList<>();
        EventKalender eventKalender = new EventKalender(list);
        eventKalender.add(e1);
        eventKalender.add(e2);
        eventKalender.add(e3);
        eventKalender.add(e4);


        System.out.println(eventKalender.toString());
        for (Event e: list) {
            System.out.println(e);
        }
        System.out.println();
        eventKalender.getByTitle("Event1");
        System.out.println(eventKalender.getByTitle("Event1"));

        System.out.println(eventKalender.getByOrt("Murfeld"));

        System.out.println(eventKalender.getByEintrittsPreis(49, 76));

        System.out.println(eventKalender.getAvgPreisByOrt("Murfeld"));

    }
}
