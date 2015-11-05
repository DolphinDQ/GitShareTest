package com.example.zdqa1.layoutsample;

/**
 * Created by zdqa1 on 2015/11/4.
 */
public class Global {
    private static Global ourInstance = new Global();

    public static Global getInstance() {
        return ourInstance;
    }

    private Global() {
    }

}
