package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Devang Verma", 85, 90, 80);
        Analyzer analyzer = new Analyzer();

        double avg = analyzer.calculateAverage(s1);
        String grade = analyzer.findGrade(avg);

        System.out.println(s1); // uses toString()
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}
