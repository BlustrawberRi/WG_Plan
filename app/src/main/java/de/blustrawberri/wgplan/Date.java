package de.blustrawberri.wgplan;

import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Created by Ri on 27.01.2015.
 */
public class Date {

    private GregorianCalendar _day;
    private HashMap<Integer, Integer> _taskmap;
    private boolean _done;

    public Date(GregorianCalendar day, int taskid, int memberid) {
        _day = day;
        _taskmap.put(taskid, memberid);
        _done = false;
    }

}
