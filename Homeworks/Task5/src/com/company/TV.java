package com.company;

import java.time.LocalTime;

public class TV {

    private static TV instance;
    private Channel[] channels;
    private int numChannel;

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    private TV() {
    }

    static {
        instance = new TV();
    }

    public static TV getInstance(Channel[] channels) {
        instance.channels=channels;
        return instance;
    }

    public void show(int numButton) {
        System.out.println(channels[numButton].showChannel());
    }
}
