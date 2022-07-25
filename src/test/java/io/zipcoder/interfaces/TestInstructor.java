package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
     public void testImplemntation() {
        Instructor instructor = new Instructor(0,"");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0,"");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructorTest = new Instructor(20, "James");
        Double expectedNumberOfHours = 12.0;
        Learner testLearn = new Student(10,"Dan");
        //When
        instructorTest.teach(testLearn, expectedNumberOfHours);
        //Then
        Assert.assertEquals(expectedNumberOfHours, testLearn.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
    //Given
        Instructor instructorTest = new Instructor(20, "James");
        Double expectedNumberOfHours = 12.0;
        Learner student = new Student(10, "Mister");
        Learner student1 = new Student(4,"Ender");
        Learner[] arrLearn = {student, student1};
    //When
        instructorTest.lecture(arrLearn, expectedNumberOfHours);
        double hoursLearned = student.getTotalStudyTime();
    //Then
        Assert.assertEquals(6.0, hoursLearned,0.00);
    }

}
