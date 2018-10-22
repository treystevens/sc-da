package model;

public class Transcript {

    private String name;
    private Integer id;


    public Transcript(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    // REQUIRES: Course should not be null and/or grade must be >= 0.0 and <= 4.0
    // MODIFIES: this
    // EFFECTS: Adds grade for specified course
    public void addGrade(String course, double grade){ }

    // Effects: Returns course name and grade in Course: Grade format
    public String getCourseAndGrade(String course){ return null; }


    // EFFECTS: Prints course names and grades
    public void printTranscript(){ }


    // EFFECTS: Returns GPA
    public double getGPA(){ return 0.0; }


    // getters
    public String getStudentName(){
        return name;
    }
}


