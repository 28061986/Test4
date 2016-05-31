package com.wilgi.argue;

public class ArgueTask implements Runnable {

    private String opinion;
    private int times;

    public ArgueTask(String opinion, int times) {
        this.opinion = opinion;
        if (times > 0)
            this.times = times;
        else this.times = 12;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(opinion + " : " + (i + 1 ) + " time.");
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
