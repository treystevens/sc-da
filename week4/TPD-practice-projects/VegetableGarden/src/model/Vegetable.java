package model;

public abstract class Vegetable implements Growable{


    String name;
    VegType vegType;
    String instructions;


    public Vegetable(String name, VegType vegType){
        setName(name);
        this.vegType = vegType;
        setInstructions("");
    }


    public String getName(){
        return name;
    }
    public VegType getType(){
        return vegType;
    }
    @Override
    public String getInstructions(){
        return instructions;
    }

    public void setName(String newName){
        this.name = newName;
    }

    protected void setInstructions(String instructions){
        this.instructions = instructions;
    }



}
