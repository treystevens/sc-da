package model;

public interface Growable {


    // EFFECTS: feeds the vegetable
    void feed();

    // EFFECTS: waters the vegetable
    void water();

    // EFFECTS: harvest the vegetable
    void harvest();

    // EFFECTS: get instructions on how to grow vegetable;
    String getInstructions();
}
