package ui;

import model.Transcript;

public class Main {

    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("Michael Scott", 4032);


        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        t2.addGrade("CS-50", 3.7);
        t2.addGrade("ENGL-100", 3.0);

        t3.addGrade("BUS-300", 3.8);
        t3.addGrade("MKT-330", 3.2);
        t3.addGrade("LDRSHP-100", 2.8);

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println(t1.getGPA());

        System.out.print(t3.getStudentName());

    }
}
