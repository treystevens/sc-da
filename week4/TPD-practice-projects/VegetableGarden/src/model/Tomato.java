package model;


public class Tomato extends Vegetable {


    public Tomato(){
        super("Tomato", VegType.SEED);

        setInstructions("If you’re planting seeds, you’ll want to start your seeds indoors 6 to 8 weeks before the average last spring frost date.");
    }

    @Override
    public void feed(){
        System.out.println("Fertilize 2 weeks before picking and 2 weeks after first picking.");
    }

    @Override
    public void water(){
        System.out.println("Water well throughout the growing season, about 2 inches per week during the summer. Water deeply for a strong root system");
    }

    @Override
    public void harvest(){
        System.out.println("Leave your tomatoes on the vine as long as possible. If any fall off before they appear ripe, place them in a paper bag with the stem up and store them in a cool, dark place.");
    }
}
