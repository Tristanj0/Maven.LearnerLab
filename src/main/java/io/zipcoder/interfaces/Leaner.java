package io.zipcoder.interfaces;

public interface Leaner {

    static void Learn (double numberOfHours) {

    }

    default Double getTotalStudyTime() {
        return null;
    }
}
