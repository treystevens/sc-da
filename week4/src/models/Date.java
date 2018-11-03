package models;

public class Date {

    private Integer day;
    private Integer month;
    private Integer year;


    public Date(Integer month, Integer day, Integer year){
        this.month = month;
        this.day = day;
        this.year = year;
    }


    // GETTERS
    public Integer getDay(){
        System.out.println(this.day);
        return this.day;
    }

    public Integer getMonth(){
        System.out.println(this.month);
        return this.month;
    }

    public Integer getYear(){
        System.out.println(this.year);
        return this.year;
    }

    public String getDateShortFormat(){
        String dateConcat = this.month + "/" + this.day + "/" + this.year;

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

        dateConcat = monthString + " "+ this.day + ", " + this.year;

        System.out.println(dateConcat);
        return dateConcat;
    }

}
