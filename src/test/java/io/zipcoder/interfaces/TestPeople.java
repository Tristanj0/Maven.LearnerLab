package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    @Test
    public void testAdd() {
         People people = new People();

         people.add(new Person(0,"John"));
         people.add(new Person(2,"Marcus"));
         people.add(new Person(3,"Micheal"));

         Assert.assertEquals(Integer.valueOf(3), people.count());
    }

    @Test
    public void testRemove() {
        ArrayList<Person> q = new ArrayList<>();
        q.add(new Person(1, "Shemar"));
        q.add(new Person(2, "Mike"));

        People people = new People();
        Person pop = new Person(3, "Marcus");
        people.add(pop);
        people.remove(pop);

        Assert.assertFalse(people.contains(pop));

    }

    @Test
    public void testFindById() {
        ArrayList<Person> q = new ArrayList<>();
        q.add(new Person(4, "Shemar"));
        q.add(new Person(3, "Mike"));

        People people = new People();
        Person pop = new Person(0, "Marcus");
        people.add(pop);
        Person finder = people.findById(3);

        Assert.assertEquals(pop, finder);

    }
}
