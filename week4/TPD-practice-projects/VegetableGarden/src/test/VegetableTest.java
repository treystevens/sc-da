package test;


import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegetableTest {


    private Vegetable carrot;
    private Vegetable lettuce;
    private Vegetable tomato;

    @Before
    public void setUp(){
        carrot = new Carrot();
        lettuce = new Lettuce();
        tomato = new Tomato();
    }

    @Test
    public void carrotTest(){
        assertEquals("Carrot", carrot.getName());
        assertEquals(VegType.ROOT, carrot.getType());
        assertEquals("Plan to plant seeds outdoors 3 to 5 weeks before the last spring frost date. Plant carrot seeds 3 to 4 inches apart in rows. Rows should be at least a foot apart.", carrot.getInstructions());

    }

    @Test
    public void lettuceTest(){
        assertEquals("Lettuce", lettuce.getName());
        assertEquals(VegType.LEAF, lettuce.getType());
        assertEquals("Plant seeds 1/2 inch deep", lettuce.getInstructions());

    }

    @Test
    public void tomatoTest(){
        assertEquals("Tomato", tomato.getName());
        assertEquals(VegType.SEED, tomato.getType());
        assertEquals("If you’re planting seeds, you’ll want to start your seeds indoors 6 to 8 weeks before the average last spring frost date.", tomato.getInstructions());

    }






}
