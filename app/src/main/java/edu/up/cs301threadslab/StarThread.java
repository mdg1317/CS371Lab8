package edu.up.cs301threadslab;

import java.util.Random;

public class StarThread extends Thread {
    private StarAnimation sa;

    public StarThread(StarAnimation mySA){
        sa = mySA;
    }  public void run(){
        boolean isRunning = true;
        Random r = new Random();
        boolean addOrRemove;
        while (isRunning) {
            addOrRemove = r.nextBoolean();
            if (addOrRemove) {
                sa.addStar();
            } else {
                sa.removeStar();
            }
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
