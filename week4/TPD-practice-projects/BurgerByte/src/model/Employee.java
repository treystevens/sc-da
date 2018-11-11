package model;

public abstract class Employee {

    public static final double BASE_WAGE = 10.00;

    protected String name;
    protected int age;
    protected double hoursWorked;
    protected boolean atWork;


    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;
    }


    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isAtWork() { return atWork; }
    public double getHoursWorked() { return hoursWorked; }


    // EFFECTS: adds hours to hoursWorked
    protected void logHoursWorked(double hours) {
        hoursWorked += hours;
    }

    public abstract void startWork(double hours);

    public abstract void leaveWork();

    public abstract double computeWage();
}
