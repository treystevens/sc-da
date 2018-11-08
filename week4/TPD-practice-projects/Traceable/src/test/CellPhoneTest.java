package test;

import model.CellPhone;
import model.Person;
import model.Call;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CellPhoneTest {


    CellPhone cellphone;
    Person owner;
    Call call;

    @Before
    public void setUp(){
        owner = new Person("Jack", "TD Bank on 5th Ave");
        cellphone = new CellPhone(owner,"646-222-2222", "Manhattan");
        call = new Call(cellphone, "Manhattan");
    }

    @Test
    public void testGetters(){
        assertEquals("Manhattan", cellphone.getLocation());
        assertEquals(cellphone, cellphone.getTrace());
    }






}
