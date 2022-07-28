package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        Students cohort = Students.getInstance();
        Instructors teachers = Instructors.getInstance();

        Student student1 = new Student(123, "James");
        Student student2 = new Student(321, "Barry");
        Student student3 = new Student(213, "Troy");

        Instructor instructor1 = new Instructor(456, "Craig");
        Instructor instructor2 = new Instructor(654, "Sally");

        cohort.add(student1);
        cohort.add(student2);
        cohort.add(student3);

        teachers.add(instructor1);
        teachers.add(instructor2);

        ZipCodeWilmington testZCW = new ZipCodeWilmington();

        ZipCodeWilmington.hostLecture(instructor2,90);

        Double expected = 30.0;
        Double actual;
        for (Student eachStudent : cohort.students){
            actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }
    }
}

