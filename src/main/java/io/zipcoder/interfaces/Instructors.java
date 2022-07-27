package io.zipcoder.interfaces;

public class Instructors extends People {

    final static private Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(1, "John"));
        add(new Instructor(2, "Ash"));
        add(new Instructor(3, "Thomas"));
        add(new Instructor(4, "Perry"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}

