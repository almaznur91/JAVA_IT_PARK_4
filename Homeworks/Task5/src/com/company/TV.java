package com.company;

import java.time.LocalTime;

public class TV {
private static TV instance;
private TV(){

    }
    static {
    instance= new TV();
    }

    public static TV getTV(){
    return instance;
    }




    private Channel[] channels;
    private int numChannel;
    private String modlTV;

    public static void setInstance(TV instance) {
        TV.instance = instance;
        getTV().modlTV="ds";
        getTV().numChannel = 0;
        getTV().channels=channels;
    }

    private TV (Channel[] channels, String modlTV) {
        this.channels = channels;

        this.modlTV = modlTV;
        this.numChannel = 0;
    }




    public void show(int numButton) {
        System.out.println(channels[numButton].showChannel());
    }


}
