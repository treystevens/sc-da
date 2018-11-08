package model;

import java.util.ArrayList;

public class CellPhone implements Traceable{

    private Person owner;
    private String cellNumber;
    private String location;
    private ArrayList<Call> calls;


    public CellPhone(Person owner, String cellNumber, String location){
        this.owner = owner;
        this.cellNumber = cellNumber;
        this.location = location;
        calls = new ArrayList<>();

        owner.setCellPhone(this);
    }


    @Override
    public String getLocation() {
        return location;
    }

    @Override
    // EFFECTS: returns the location of the cellphone
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("Tracking the cell phone from " + owner.getName() + "...");
    }

    public ArrayList<Call> getCalls(){
        return calls;
    }

    // MODIFIES: This
    // EFFECTS: Adds a call to the call log
    public void makeCall(Call call){
        calls.add(call);
    }



}
