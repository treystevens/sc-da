package tests;

import models.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TimeTest {

    Time tt;
    Time tt1;
    Time tt2;
    Time tt3;


    @Before
    public void SetUp(){
        tt = new Time(12, 45);
        tt1 = new Time(16, 10);
        tt2 = new Time(5, 25);
        tt3 = new Time(24, 25);
    }

    @Test
    public void getTimeMilitaryTest(){
        assertEquals(tt.getTimeMilitary(), "12:45");
        assertEquals(tt1.getTimeMilitary(), "16:10");
        assertEquals(tt2.getTimeMilitary(), "5:25");
        assertEquals(tt3.getTimeMilitary(), "24:25");

    }

    @Test
    public void getTimeTest(){
        assertEquals(tt.getTime(), "12:45pm");
        assertEquals(tt1.getTime(), "4:10pm");
        assertEquals(tt2.getTime(), "5:25am");
        assertEquals(tt3.getTime(), "12:25am");


    }
}
