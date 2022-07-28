package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People {
    final static private Students INSTANCE = new Students();
    List<Student> students;

    private Students() {
         students = new ArrayList<>();

      add (new Student(1, "Harry"));
      add (new Student(2, "Dan"));
      add (new Student(3, "Kevin"));
      add (new Student(4, "Washington"));
      add (new Student(5, "Lincoln"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public void add() {
                students.add(new Student(1, "Harry"));
                students.add(new Student(3, "Kevin"));
                students.add(new Student(4, "Washington"));
                students.add(new Student(5, "Lincoln"));
                students.add(new Student(2, "Dan"));
    }
}
