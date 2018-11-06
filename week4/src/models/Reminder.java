package models;

public class Reminder extends Entry {

    private String note;

    public Reminder(Date date, Time time, String label){
        super(date, time, label);
    }

    //EFFECTS: If note is null return "no note added", otherwise return the note
    public String getNote(){
        if(note == null){
            return "No note added";
        } else {
            return note;
        }
    }

    //MODIFIES: This
    //EFFECTS: Sets note to given note
    public void setNote(String note){
        this.note = note;
    }

}
