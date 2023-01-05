package com.mytime;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if ((0 <= hour && hour <= 23) && (0 <= minute && minute <= 59) && (0 <= second && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public MyTime nextSecond() {
        second += 1;
        if (second == 60) {
            second = 0;
            minute += 1;
            if (minute == 60) {
                minute = 0;
                hour += 1;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        minute += 1;
        if (minute == 60) {
            minute = 0;
            hour += 1;
            if (hour == 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        hour += 1;
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second -= 1;
        if (second == -1) {
            second = 59;
            minute -= 1;
            if (minute == -1) {
                minute = 59;
                hour -= 1;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        minute -= 1;
        if (minute == -1) {
            minute = 59;
            hour -= 1;
            if (hour == -1) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        hour -= 1;
        if (hour == -1) {
            hour = 23;
        }
        return this;
    }
}

