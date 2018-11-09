package test;

import model.CellPhone;
import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;
    private CellPhone cellphone;
    private Fingerprint fingerprint;


    @Before
    public void setUp(){

        person = new Person("Tester01", "Bronx");
        cellphone = new CellPhone(person, "718-111-1111", "Columbus Circle");
        fingerprint = new Fingerprint(person, "46th Precinct");


    }

    @Test
    public void testGetters(){
        assertEquals("Tester01", person.getName());
        assertEquals("Bronx", person.getLocation());
        assertEquals(person, person.getTrace());
    }


    @Test
    public void addFingerprintTest(){
        person.addFingerPrint(fingerprint);
        assertEquals(fingerprint, person.getFingerprint());
    }

    @Test
    public void setCellphoneTest(){
        person.setCellPhone(cellphone);
        assertEquals(cellphone, person.getCellPhone());
    }

}


