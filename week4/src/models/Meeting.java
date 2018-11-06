package models;

import java.util.ArrayList;

public class Meeting extends Event{

    private ArrayList<String> attendees;


    public Meeting(Date date, Time time, String label){
        super(date, time, label);


        attendees = new ArrayList<>();
    }


    public ArrayList<String> getAttendees(){
        return attendees;
    }

    // REQUIRES: attendee != null
    // MODIFIES: This
    // EFFECTS: Adds an attendee to list of invited people
    public void addAttendees(String attendee){
        attendees.add(attendee);
    }

    // REQUIRES: attendee != null
    // MODIFIES: This
    // EFFECTS: Removes an attendee from the list of invited people
    public void removeAttendees(String attendee){
        attendees.remove(attendee);
    }


    // EFFECTS: Prints out invitations
    public void sendInvites(){

        for(String s : attendees){
            System.out.println("Inviting: " + s);
        }

    }


}
