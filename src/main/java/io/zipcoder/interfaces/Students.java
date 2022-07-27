package io.zipcoder.interfaces;

public class Students extends People {
    final static private Students INSTANCE = new Students();

    private Students() {
      add (new Student(1, "Harry"));
      add (new Student(2, "Dan"));
      add (new Student(3, "Kevin"));
      add (new Student(4, "Washington"));
      add (new Student(5, "Lincoln"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
