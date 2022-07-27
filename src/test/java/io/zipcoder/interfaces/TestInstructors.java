package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test() {
        Instructors instructors = Instructors.getInstance();
        Assert.assertEquals("John",instructors.getInstance().findById(1).getName());
        Assert.assertEquals("Ash",instructors.getInstance().findById(2).getName());
        Assert.assertEquals("Thomas",instructors.getInstance().findById(3).getName());
        Assert.assertEquals("Perry",instructors.getInstance().findById(4).getName());

    }
}
