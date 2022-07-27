package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        Students students = Students.getInstance();
        Assert.assertEquals("Harry",students.getInstance().findById(1).getName());
        Assert.assertEquals("Dan",students.getInstance().findById(2).getName());
        Assert.assertEquals("Kevin",students.getInstance().findById(3).getName());
        Assert.assertEquals("Washington",students.getInstance().findById(4).getName());
        Assert.assertEquals("Lincoln",students.getInstance().findById(5).getName());



    }
}
