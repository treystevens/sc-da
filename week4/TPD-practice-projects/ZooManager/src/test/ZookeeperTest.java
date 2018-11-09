package test;


import model.Animal;
import model.Elephant;
import model.Horse;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZookeeperTest {

    private Zookeeper zookeeper;
    private Animal buzzyElephant;
    private Animal chunkyHorse;

    @Before
    public void setUp(){
        zookeeper = new Zookeeper("Zoey", 25);
        Animal buzzyElephant = new Elephant("Buzzy", "Africa", 4, zookeeper, 1300);
        Animal chunkyHorse = new Horse("Chappy", "U.S.A", 12, zookeeper, 1000, 28);
    }

    @Test
    public void testGetters(){
        assertEquals("Zoey", zookeeper.getName());
        assertEquals(25, zookeeper.getAge());
        assertEquals(zookeeper.getAnimals().size(), 0);
    }

    @Test
    public void testSetFavourite(){


        zookeeper.setFavourite(buzzyElephant);
        assertEquals(buzzyElephant, zookeeper.getFavourite());
    }

    @Test
    public void testAddAnimals(){
        assertEquals(zookeeper.getAnimals().size(), 0);

        zookeeper.addAnimal(buzzyElephant);
        zookeeper.addAnimal(chunkyHorse);
        assertEquals(zookeeper.getAnimals().size(), 2);

    }

    @Test
    public void removeAnimal(){
        zookeeper.addAnimal(buzzyElephant);
        zookeeper.addAnimal(chunkyHorse);
        assertEquals(zookeeper.getAnimals().size(), 2);

        zookeeper.removeAnimal(buzzyElephant);
        assertEquals(zookeeper.getAnimals().size(), 1);
    }

}
