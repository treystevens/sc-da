package model;

public class Carrot extends Vegetable {

    public Carrot(){
        super("Carrot", VegType.ROOT);

        setInstructions("Plan to plant seeds outdoors 3 to 5 weeks before the last spring frost date. Plant carrot seeds 3 to 4 inches apart in rows. Rows should be at least a foot apart.");

    }

    @Override
    public void feed(){
        System.out.println("Fertilize 5-6 weeks after planting");
    }

    @Override
    public void water(){
        System.out.println("Water one inch per week");

    }

    @Override
    public void harvest(){
        System.out.println("Carrots should be mature and ready for harvest after about 2–4 months");
    }
}
