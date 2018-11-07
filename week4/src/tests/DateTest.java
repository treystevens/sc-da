package tests;

import models.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {

    private Date d1;

    @Before
    public void setUp(){
        d1 = new Date(7, 7, 2019);
    }

    @Test
    public void constructorTest(){
        assertEquals(7, d1.getMonth());
        assertEquals(7, d1.getDay());
        assertEquals(2019, d1.getYear());

        d1 = new Date(8, 8, 2020);
        assertEquals(2020, d1.getYear());
    }

    @Test
    public void getDateShortFormatTest(){
        assertEquals("7/7/2019" ,d1.getDateShortFormat());

        d1 = new Date(8, 8, 2020);
        assertEquals("8/8/2020" ,d1.getDateShortFormat());


    }

    @Test
    public void getDateLongFormatTest(){
        d1 = new Date(1, 1, 2019);
        assertEquals("January 1, 2019" ,d1.getDateLongFormat());
        d1 = new Date(2, 2, 2019);
        assertEquals("February 2, 2019" ,d1.getDateLongFormat());
        d1 = new Date(3, 3, 2019);
        assertEquals("March 3, 2019" ,d1.getDateLongFormat());
        d1 = new Date(4, 4, 2019);
        assertEquals("April 4, 2019" ,d1.getDateLongFormat());
        d1 = new Date(5, 5, 2019);
        assertEquals("May 5, 2019" ,d1.getDateLongFormat());
        d1 = new Date(6, 6, 2019);
        assertEquals("June 6, 2019" ,d1.getDateLongFormat());
        d1 = new Date(7, 7, 2019);
        assertEquals("July 7, 2019" ,d1.getDateLongFormat());
        d1 = new Date(8, 8, 2019);
        assertEquals("August 8, 2019" ,d1.getDateLongFormat());
        d1 = new Date(9, 9, 2019);
        assertEquals("September 9, 2019" ,d1.getDateLongFormat());
        d1 = new Date(10, 10, 2022);
        assertEquals("October 10, 2022" ,d1.getDateLongFormat());
        d1 = new Date(11, 11, 2020);
        assertEquals("November 11, 2020" ,d1.getDateLongFormat());
        d1 = new Date(12, 12, 2020);
        assertEquals("December 12, 2020" ,d1.getDateLongFormat());
    }


}
