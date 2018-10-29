package model;

import java.util.ArrayList;
import java.util.List;



/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */
public class Transcript {

    private String name;
    private Integer id;
    List<String> studentClasses;
    List<Double> studentGrades;



    public Transcript(String name, Integer id){
        this.name = name;
        this.id = id;
        studentClasses = new ArrayList<String>();
        studentGrades = new ArrayList<Double>();
    }

    // REQUIRES: Course should not be null and/or grade must be >= 0.0 and <= 4.0
    // MODIFIES: this
    // EFFECTS: Adds grade for specified course
    public Boolean addGrade(String course, double  grade){

        if(course == ""){
            return false;
        }

        if(grade < 0 || grade > 4){
            return false;
        }

        studentClasses.add(course);
        studentGrades.add(grade);

        return true;
    }

    // REQUIRES: a course the student has already taken.
    // EFFECTS: Returns course name and grade in Course: Grade format
    public String getCourseAndGrade(String course){

        Integer gradeIndex = 0;

        for(int i = 0; i < studentClasses.size(); i++){
            if(course == studentClasses.get(i)){
                gradeIndex = i;
            }
        }

        return course + ": " + studentGrades.get(gradeIndex);
    }


    // EFFECTS: Prints course names and grades
    public void printTranscript(){

        for(int i = 0; i < studentClasses.size(); i++){
            System.out.println( studentClasses.get(i) + ": " + studentGrades.get(i));
        }
    }


    // EFFECTS: Returns GPA
    public double getGPA(){
        double total = 0;


        for(double grade : studentGrades){
            total += grade;
        }

        return total / studentGrades.size();
    }


    // getters
    public String getStudentName(){
        return name;
    }
    public Integer getClassesSize(){
        return studentClasses.size();
    }
    public List<Double> getGrades(){
        return studentGrades;
    }
    public List<String> getClasses(){
        return studentClasses;
    }
}


