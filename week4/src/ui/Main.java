package ui;


import models.*;

public class Main {
    public static void main(String[] args) {
        Calendar cal1 = new Calendar(new Date(4, 8, 2018));
        cal1.setEmail("123@gmail.com");

        Date tomorrow = new Date(11, 7, 2018);
        Date nextWeek = new Date(11, 13, 2018);
        Date nextMonth = new Date(12, 6, 2018);

        Reminder r1 = new Reminder(tomorrow, new Time(6, 0), "Study classes");
        r1.setNote("Make sure to complete final project before 9pm");


        cal1.addEntry(r1);
        cal1.addEntry(new Event(nextWeek, new Time(12, 00), "Lunch with Chloe"));
        Meeting m = new Meeting(nextMonth, new Time(9, 0), "Testing 101");

        m.addAttendee("joey123@gmail.com");
        m.addAttendee("chloe123@gmail.com");

        cal1.addEntry(m);

        m.sendInvites();
        System.out.println();

        cal1.printEntries();

    }
}
