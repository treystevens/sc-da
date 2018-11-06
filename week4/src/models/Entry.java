package models;

public abstract class Entry {

    private Date date;
    private Time time;
    private String label;
    private Integer intervalOfRepetition;

    public Entry(Date date, Time time, String label){
        this.date = date;
        this.time = time;
        this.label = label;
    }


    public Date getDate(){
        return date;
    }

    public Time getTime(){
        return time;
    }

    public String getLabel(){
        return label;
    }

    public Boolean isRepeating(){
        return intervalOfRepetition != 0;
    }

    //EFFECTS: returns interval of repetition, or 0 if none
    public Integer getIntervalOfRepetition(){
        return intervalOfRepetition;
    }

    // REQUIRES: Interval > 0
    // MODIFIES: This
    // EFFECTS: interval of repetition in days, or 0 if not repeating
    public void setIntervalOfRepetition(Integer interval){
        intervalOfRepetition = interval;
    }



}
