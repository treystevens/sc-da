package model;

public class Lettuce extends Vegetable {

    public Lettuce(){
        super("Lettuce", VegType.LEAF);

        setInstructions("Plant seeds 1/2 inch deep");
    }

    @Override
    public void feed(){
        System.out.println("Feed it with organic matter about one week before you seed or transplant");
    }

    @Override
    public void water(){
        System.out.println("Water thoroughly at time of transplant");

    }

    @Override
    public void harvest(){
        System.out.println("Lettuce should be harvested when full size, but just before maturity. You want it young and tender.");

    }
}
