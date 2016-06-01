package com.wilgi.argue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Argue {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new ArgueTask("Err", 20));
        service.submit(new ArgueTask("New222222222", 21));
		//comment
        service.shutdown();
    }
}
