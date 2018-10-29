package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TranscriptTest {

    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Michael Scott", 4032);

    }

    @Test
    public void addGradeTest(){

          assertTrue(testTranscript.addGrade("empty", 3.8));

          List<String> testClassesList = testTranscript.getClasses();
          List<Double> testGradesList = testTranscript.getGrades();

          assertEquals(testClassesList.size(), 1);
          assertEquals(testGradesList.size(), 1);

    }

    @Test
    public void addLowBoundaryGradeTest(){
        assertTrue(testTranscript.addGrade("empty", 0));
        List<String> testClassesList = testTranscript.getClasses();
        List<Double> testGradesList = testTranscript.getGrades();

        assertEquals(testClassesList.size(), 1);
        assertEquals(testGradesList.size(), 1);

    }

    @Test
    public void addHighBoundaryGradeTest(){
        assertTrue(testTranscript.addGrade("empty", 4.0));
        List<String> testClassesList = testTranscript.getClasses();
        List<Double> testGradesList = testTranscript.getGrades();

        assertEquals(testClassesList.size(), 1);
        assertEquals(testGradesList.size(), 1);

    }

    @Test
    public void addOutOfRangeLowGrade(){

        assertFalse(testTranscript.addGrade("empty", -4.3));

        List<String> testClassesList = testTranscript.getClasses();
        List<Double> testGradesList = testTranscript.getGrades();

        assertEquals(testClassesList.size(), 0);
        assertEquals(testGradesList.size(), 0);

    }

    @Test
    public void addOutOfRangeHighGrade(){

        assertFalse(testTranscript.addGrade("empty", 10.3));

        List<String> testClassesList = testTranscript.getClasses();
        List<Double> testGradesList = testTranscript.getGrades();

        assertEquals(testClassesList.size(), 0);
        assertEquals(testGradesList.size(), 0);

    }



    @Test
    public void addEmptyClassTest(){
        assertFalse(testTranscript.addGrade("", 3.4));

        List<String> testClassesList = testTranscript.getClasses();
        List<Double> testGradesList = testTranscript.getGrades();

        assertEquals(testClassesList.size(), 0);
        assertEquals(testGradesList.size(), 0);
    }


    @Test
    public void getCourseAndGradeTest(){
        testTranscript.addGrade("test 1", 3.4);
        testTranscript.addGrade("test 2", 2.3);
        testTranscript.addGrade("test 3", 4.0);

        String cg1 = testTranscript.getCourseAndGrade("test 1");
        String cg2 = testTranscript.getCourseAndGrade("test 2");
        String cg3 = testTranscript.getCourseAndGrade("test 3");

        assertEquals(cg1, "test 1: 3.4");
        assertEquals(cg2, "test 2: 2.3");
        assertEquals(cg3, "test 3: 4.0");



    }

}
