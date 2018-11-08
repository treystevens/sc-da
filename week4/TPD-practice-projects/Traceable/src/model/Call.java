package model;

public class Call implements Traceable {


    private CellPhone cellphone;
    private String location;

    public Call(CellPhone cellphone, String location){
        this.cellphone = cellphone;
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    // EFFECTS: get the cellphone from an outgoing call
    public Object getTrace() {
        return cellphone;
    }

    @Override
    public void track() {
        System.out.println("Tracking where the call was made from...");
        System.out.println("Call was from " + location);
    }

}
