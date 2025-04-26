package com.test;

public class TaskRunner {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task Completed";
    }
}
