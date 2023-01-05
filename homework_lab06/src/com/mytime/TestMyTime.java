package com.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(10, 10, 10);
        System.out.println(time1);
        time1.setHour(11);
        time1.setMinute(11);
        time1.setSecond(11);
        System.out.println(time1);

        MyTime time2 = new MyTime();
        time2.setTime(23, 59, 58);

        System.out.println(time2);
        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());

        System.out.println(time2.nextHour());
        System.out.println(time2.previousHour());

        System.out.println(time2.nextMinute());
        System.out.println(time2.previousMinute());

        System.out.println(time2.nextSecond());
        System.out.println(time2.previousSecond());

        System.out.println(time2.nextSecond().nextSecond().nextSecond());
        System.out.println(time2.previousSecond().previousSecond());
    }
}

