package se.lexicon.sami;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TimeExercises {
    public static void main(String[] args) {
        exercise1();
       exercise2();
       /*  exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();
        exercise16();
        extraChallenge();*/

    }

    public static void exercise1() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Exercise 1: " + currentDate);
    }

    public static void exercise2() {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Exercise 2: " + formattedDate);
    }
}
