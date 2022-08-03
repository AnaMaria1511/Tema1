package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) throws IOException {
        
        ReadExhangeRate data = new ReadExhangeRate();
        final String[] result = {"1"};// for test
        System.out.println(result[0]);
        Timer t = new Timer();
        t.schedule(new TimerTask() {

            @Override
            public void run() {
                try {
                    if(!data.read().equals(result[0]))
                    {
                        result[0] = data.read();
                        System.out.println("1 EURO = " + result[0] + " USD");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 5000, 5000);
    }
}
