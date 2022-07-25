package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
    Student student = new Student(0, "");
    Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
    Student student = new Student(0, "");
    Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
    //Given
        Student test = new Student(20, "James");
        Double expectedNumberOfHours = 12.0;
    //When
        test.learn(expectedNumberOfHours);
    //Then
        Assert.assertEquals(expectedNumberOfHours, test.getTotalStudyTime());



    }
}
