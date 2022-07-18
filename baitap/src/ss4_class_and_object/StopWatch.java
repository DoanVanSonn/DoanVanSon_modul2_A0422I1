package ss4_class_and_object;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private long startTime,endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public StopWatch(){
    this.startTime= new Date().getTime();
    }
    public void start(){
        this.startTime= new Date().getTime();
    }
    public void stop(){
        this.endTime= new Date().getTime();
    }
    public long  getElapsedTime(){
        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();

        int button;
        Scanner scanner= new Scanner(System.in);
        do { stopWatch.start();
            System.out.println("nhap vao button");
           button= scanner.nextInt();

               stopWatch.stop();
               System.out.println(stopWatch.getElapsedTime());
        }
        while (button!=0);

    }
}
