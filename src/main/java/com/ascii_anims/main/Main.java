package com.ascii_anims.main;

import java.util.concurrent.TimeUnit;

public class Main {

    private static final String[] WHEEL_SYMBOLS = {"|", "/", "-", "\\"}; //the symbols for the wheel animation, change if needed
    private static final String lineReset = "\r";
    private static final long speed = 500L; //this defines the speed of animation (lesser - faster), change to your liking

    public static void main(String[] args) {
        try {
            while (true) { //making a while loop ensures that the animation will NOT stop..
                for (String symbol : WHEEL_SYMBOLS) {
                    System.out.print(lineReset + symbol);
                    TimeUnit.MILLISECONDS.sleep(speed);
                }
            }
        } catch (InterruptedException e) { //..until something causes it to
            //empty catch block
        }
    }
}
