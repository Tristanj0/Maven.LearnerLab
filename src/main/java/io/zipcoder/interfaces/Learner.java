package io.zipcoder.interfaces;

public interface Learner {

    void learn (double numberOfHours);



    default Double getTotalStudyTime() {
        return null;
    }
}
