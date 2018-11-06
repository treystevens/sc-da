package models;

public class Time {

    private int hour;
    private int minute;

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public String getTime(){
        String timeOfDay;
        Integer hourSplit = hour % 12;

        if(hour >= 12 && hour < 24) {
            timeOfDay = "pm";
        }
        else{ timeOfDay = "am"; }

        if(hourSplit == 0){
            hourSplit = 12;
        }

        return hourSplit + ":" + minute + timeOfDay;
    }

    public String getTimeMilitary(){
        return hour + ":" + minute;
    }

}
