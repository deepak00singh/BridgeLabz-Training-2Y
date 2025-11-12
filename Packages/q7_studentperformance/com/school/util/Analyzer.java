package com.school.util;

import com.school.data.Student;

public class Analyzer {

    // Calculate average marks of the student
    public double calculateAverage(Student s) {
        return (s.getMark1() + s.getMark2() + s.getMark3()) / 3;
    }

    // Find grade based on average
    public String findGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 45) return "C";
        else return "Fail";
    }
}
