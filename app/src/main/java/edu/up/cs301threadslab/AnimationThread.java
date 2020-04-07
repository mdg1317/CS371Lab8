package edu.up.cs301threadslab;

public class AnimationThread extends Thread {
    private AnimationView av;

    public AnimationThread(AnimationView myAV){
        av = myAV;
    }

    @Override
    public void run(){
        boolean isRunning = true;
        while(isRunning){
            av.postInvalidate();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
