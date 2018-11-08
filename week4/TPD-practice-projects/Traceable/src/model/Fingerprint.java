package model;

public class Fingerprint implements Traceable {


    private Person owner;
    private String location;



    public Fingerprint(Person owner, String location){
        this.owner = owner;
        this.location = location;
        owner.addFingerPrint(this);
    }


    public Person getOwner(){
        return owner;
    }

    @Override
    // EFFECTS: returns location of where the fingerprints were taken
    public String getLocation() {
        return this.location;
    }

    @Override
    // EFFECTS: Gets who the fingerprint belongs to
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("Tracking... the fingerprint is from " + owner.getName());
    }

}
