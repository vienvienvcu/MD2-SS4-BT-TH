package BT;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;
//    CONSTRUCTOR
    public StopWatch() {
    }
    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = new Date();
    }
    public void end() {
        this.endTime = new Date();
    }
    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

//    public void display(){
//        System.out.println("startTime: " + this.startTime);
//        System.out.println("endTime: " + this.endTime);
//    }
}
