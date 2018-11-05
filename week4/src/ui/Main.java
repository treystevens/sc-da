package ui;


import models.Date;

public class Main {
    public static void main(String[] args) {
        Date dateCheck = new Date(11, 7, 1993);


        dateCheck.getDay();
        dateCheck.getMonth();
        dateCheck.getYear();
        dateCheck.getDateShortFormat();
        dateCheck.getDateLongFormat();



    }
}
