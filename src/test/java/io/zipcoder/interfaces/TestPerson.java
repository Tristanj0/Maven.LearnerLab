package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
    //Given
       long expectedId = 20;
       String expectedName = "Tristan";
    //When
        Person test = new Person(expectedId, expectedName);
    //Then
        Assert.assertEquals(expectedId, test.getId());
        Assert.assertEquals(expectedName, test.getName());
    }

    @Test
    public void testSetName() {
    //Given
        String originalName = "James";
        long Id = 15;
    //When
        Person test = new Person(Id, originalName);
        String expectedName = "Tristan";
        test.setName(expectedName);
    //Then
        Assert.assertEquals(expectedName, test.getName());

    }

}
