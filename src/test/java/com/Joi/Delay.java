package com.Joi;

public class Delay {
    //int d in milliseconds

    public static void main(int d){
        try {
            Thread.sleep(d);
        } catch (InterruptedException e) {
        }
    }
}
