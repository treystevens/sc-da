package models;

public class Event extends Entry{
    public Event(Date date, Time time, String label) {
        super(date, time, label);
    }

    private Reminder reminder;

    public Reminder getReminder(){
        return reminder;
    }

    public void setReminder(Reminder newReminder){
        reminder = newReminder;
    }


}