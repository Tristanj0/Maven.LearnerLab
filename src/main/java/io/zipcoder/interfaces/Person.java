package io.zipcoder.interfaces;

public class Person {

    public final Long Id;

    public String name;
    public Person (long Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Student implements Leaner {

    }
}





