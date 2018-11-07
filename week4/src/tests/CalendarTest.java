package tests;

import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalendarTest {

    Calendar c1;
    Date d;

    @Before
    public void setUp(){
        d = new Date(11, 6, 2018);
        c1 = new Calendar(d);
    }

    @Test
    public void testConstructor(){
        assertEquals(c1.getDate(), d);
    }

    @Test
    public void emailTest(){
        c1.setEmail("123test@gmail.com");
        assertEquals(c1.getEmail(), "123test@gmail.com");

        c1.setEmail("456test@gmail.com");
        assertEquals(c1.getEmail(), "456test@gmail.com");
    }


    @Test
    public void entryTest(){

        Time midday = new Time(12, 0);
        Time night = new Time (9, 45);

        Entry e1 = new Meeting(d, midday, "Yoga Basics" );
        Entry e2 = new Reminder(d, night, "Take out the trash.");

        c1.addEntry(e1);
        c1.addEntry(e2);
        assertEquals(2, c1.getEntries().size());


        c1.removeEntry(e2);
        assertEquals(1, c1.getEntries().size());
    }


}
