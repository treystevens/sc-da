package models;

import java.util.ArrayList;

public class Calendar {


    ArrayList<Entry> calendar;

    public Calendar(){
        calendar = new ArrayList<>();
    }

    public void add(Entry e){
        calendar.add(e);

    }
}
