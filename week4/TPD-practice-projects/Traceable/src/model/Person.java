package model;

public class Person implements Traceable{

    private String name;
    private CellPhone cellphone;
    private Fingerprint fingerprint;
    private String location;

    public Person(String name, String location){
        this.name = name;
        cellphone = null;
        fingerprint = null;
        this.location = location;
    }


    // GETTERS
    public String getName(){
        return name;
    }
    public CellPhone getCellPhone(){
        return cellphone;
    }
    public Fingerprint getFingerprint(){
        return fingerprint;
    }
    @Override
    public String getLocation() {
        return this.location;
    }
    @Override
    public Object getTrace() {
        return this;
    }
    @Override
    public void track() {
        System.out.println("Tracking " + name + "'s location...");
        System.out.println(location);
    }


    // MODIFIES: This
    // EFFECTS: Gives the user a new cellphone
    public void setCellPhone(CellPhone cell){
        this.cellphone = cell;
    }

    // MODIFIES: This
    // EFFECTS: Gets the users fingerprint
    public void addFingerPrint(Fingerprint fingerprint){
        this.fingerprint = fingerprint;
    }

}
