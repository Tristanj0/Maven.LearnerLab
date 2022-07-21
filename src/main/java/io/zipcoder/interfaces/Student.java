package io.zipcoder.interfaces;

public class Student extends Person implements Leaner {

    double totalStudyTime;
    public Student(long Id, String name) {
        super(Id, name);
        double totalStudyTime = 0;
    }


    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
