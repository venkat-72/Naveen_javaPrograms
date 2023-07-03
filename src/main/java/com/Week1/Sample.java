package com.Week1;
public class Sample {
    static int value ;

    static {
        value = sampleValue();
    }
    public static int sampleValue(){
        return 100;
    }

    public static int getValue() {
        return value;
    }
}