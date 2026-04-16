package _04arithematicOperator;

import java.time.LocalTime;

public class CurrentTime {
    public static void main(String[] args) {

        long totalMilliSec = System.currentTimeMillis();

        long totalSec = totalMilliSec / 1000;
        long currentSec = totalSec % 60;

        long totalMin = totalSec / 60;
        long currentMin = totalMin % 60;

        long totalHr = totalMin / 60;
        long currentHr = totalHr % 60;

        System.out.println("Current time is "+currentHr+":"+currentMin+":"+currentSec+" GMT");

        LocalTime time = LocalTime.now();
        System.out.println(time);


    }
}
