package models;

import java.util.ArrayList;

public class Calendar {


    private ArrayList<Entry> entries;
    private Date currentDate;
    private String email;

    public Calendar(Date currentDate){
        this.currentDate = currentDate;

        entries = new ArrayList<>();
    }


    // getters
    public Date getDate(){
        return currentDate;
    }
    public String getEmail(){
        System.out.println(email);
        return email;
    }
    public ArrayList<Entry> getEntries(){
        return entries;
    }



    // REQUIRES: email != null
    // MODIFIES: This
    // EFFECTS: sets the email to given email
    public void setEmail(String email){
        this.email = email;
        System.out.println(email);
    }

    // REQUIRES: e != null
    // MODIFIES: this
    // EFFECTS: adds entry to calendar
    public void addEntry(Entry e){
        entries.add(e);
    }

    // MODIFIES: this
    // EFFECTS: removes entry from calendar
    public void removeEntry(Entry e){
        entries.remove(e);
    }


    // EFFECTS: prints out all the entries , date : label
    public void printEntries(){

        for(Entry e : entries){
            System.out.println("Date: " + e.getDate().getDateLongFormat());
            System.out.println("Label: " + e.getLabel());
        }

    }
}
