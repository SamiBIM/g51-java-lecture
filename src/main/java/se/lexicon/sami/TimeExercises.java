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
       exercise3();
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
        /*exercise15();
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

    public static void exercise3() {
        LocalDate today = LocalDate.now();
        LocalDate lastMonday = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        System.out.println("Exercise 3:");
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }
    }



    public static void exercise4() {
        String dateString = "2023-06-14";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Exercise 4: " + parsedDate);
    }

    public static void exercise5() {
        LocalDate birthday = LocalDate.of(1990, Month.JULY, 25);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println("Exercise 5: " + dayOfWeek);
    }

    public static void exercise6() {
        LocalDate futureDate = LocalDate.now().plusYears(10).minusMonths(10);
        Month month = futureDate.getMonth();
        System.out.println("Exercise 6: " + month);
    }

    public static void exercise7() {
        LocalDate futureDate = LocalDate.now().plusYears(10).minusMonths(10);
        LocalDate birthday = LocalDate.of(1990, Month.JULY, 25);
        Period period = Period.between(birthday, futureDate);
        System.out.println("Exercise 7: Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());
    }

    public static void exercise8() {
        Period period = Period.of(4, 7, 29);
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plus(period);
        System.out.println("Exercise 8: " + newDate);
    }

    public static void exercise9() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Exercise 9: " + currentTime);
    }

    public static void exercise10() {
        LocalTime currentTime = LocalTime.now();
        int nanoSeconds = currentTime.getNano();
        System.out.println("Exercise 10: " + nanoSeconds);
    }

    public static void exercise11() {
        String timeString = "10:15:30";
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println("Exercise 11: " + parsedTime);
    }

    public static void exercise12() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Exercise 12: " + formattedTime);
    }

    public static void exercise13() {
        LocalDateTime dateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        System.out.println("Exercise 13: " + dateTime);
    }

    public static void exercise14() {
        LocalDateTime dateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", Locale.forLanguageTag("sv"));
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Exercise 14: " + formattedDateTime);
    }

}
