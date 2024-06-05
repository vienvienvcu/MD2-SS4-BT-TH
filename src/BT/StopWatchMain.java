package BT;

import java.util.Random;

public class StopWatchMain {
    public static void main(String[] args) {
        System.out.println("show time");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int [] numbers = new int[10000000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000000);
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime() +"milliseconds");
    }
}
