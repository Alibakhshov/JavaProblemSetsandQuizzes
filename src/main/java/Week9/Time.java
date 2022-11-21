//Instructions:
//
//        Implement all the classes using Java programming language from the given UML Class diagram.
//        Note: This problem requires you to submit only one class: Time.java.
//
//        Do NOT include "public static void main()" method inside all of these classes. Graders will be testing your classes, using the unit-testing framework JUnit 4.
//
//
//
//

package Week9;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public Time nextSecond() {
        return new Time(this.hour, this.minute, this.second + 1);
    }

    public Time previousSecond() {
        return new Time(this.hour, this.minute, this.second - 1);
    }
}
