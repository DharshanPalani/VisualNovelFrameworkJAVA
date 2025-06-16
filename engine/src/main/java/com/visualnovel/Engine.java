package com.visualnovel;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    private static final Map<String, Runnable> scenes = new HashMap<>();

    public static void scene(String name, Runnable handler) {
        scenes.put(name, handler);
        System.out.println(name + " is registered");
    }

    public static void say(String name, String dialogue) {
        System.out.println(name + " : " + dialogue);
    }

    public static void run(String name) {
        Runnable runnable = scenes.get(name);
        if(runnable == null) {
            System.out.println("Scene not found of: " + name);
            return;
        }

        runnable.run();
  
    }
}
