package models;

public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }


    // GETTERS
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public String getDateShortFormat(){
        String dateConcat = month + "/" + day + "/" + year;

        System.out.println(dateConcat);
        return dateConcat;
    }

    public String getDateLongFormat(){
        String monthString;
        String dateConcat;

        switch (getMonth()) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }

        dateConcat = monthString + " "+ day + ", " + year;

        System.out.println(dateConcat);
        return dateConcat;
    }

}
