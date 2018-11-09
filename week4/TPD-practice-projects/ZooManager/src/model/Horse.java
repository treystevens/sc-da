package model;

public class Horse extends Animal{

    private double topSpeed;

    public Horse(String name, String country, int age, Zookeeper careTaker, double weight, double ts) {
        super(name, country, age, careTaker, weight);
        topSpeed = ts;
    }

    // getters
    public double getTopSpeed() { return topSpeed; }


}