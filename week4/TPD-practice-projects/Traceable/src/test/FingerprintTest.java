package test;



import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FingerprintTest {

    Fingerprint fingerprint;
    Person person;

    @Before
    public void setUp(){
        person = new Person("Tester01", "Gotham Testing Lab");
        fingerprint = new Fingerprint(person, "Gotham Precinct");

    }


    @Test
    public void testGetters(){
        assertEquals(fingerprint.getOwner(), person);
        assertEquals("Gotham Precinct", fingerprint.getLocation());
        assertEquals(fingerprint, fingerprint.getTrace());
    }
}
