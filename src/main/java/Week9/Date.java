//Instructions:
//
//        Implement all the classes using Java programming language from the given UML Class diagram.
//        Note: This problem requires you to submit only one class: Date.java.
//
//        Do NOT include "public static void main()" method inside all of these classes. Graders will be testing your classes, using the unit-testing framework JUnit 4.

package Week9;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

    public Date nextDay() {
        return new Date(this.day + 1, this.month, this.year);
    }

    public Date previousDay() {
        return new Date(this.day - 1, this.month, this.year);
    }
}

