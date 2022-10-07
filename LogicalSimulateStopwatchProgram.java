package com.bridgelabz;

//  a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
//     the start and end clicks
//  b. I/P -> Start the Stopwatch and End the Stopwatch
//  c. Logic -> Measure the elapsed time between start and end
//  d. O/P -> Print the elapsed time.

import java.util.Scanner;

public class LogicalSimulateStopwatchProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start,stop;
        double tim;
        System.out.println("press 1 to start the stopwatch");
        int s = sc.nextInt();
        start = System.currentTimeMillis();
        System.out.println("press 2 to stop the stopwatch");
        int m = sc.nextInt();
        stop = System.currentTimeMillis();
        tim = (stop-start)/1000.0;
        System.out.println(tim);
    }
}
