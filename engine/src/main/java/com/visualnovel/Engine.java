package com.visualnovel;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    private static final Map<String, Scene> scenes = new HashMap<>();

    public static void registerScene(String name, Scene scene) {
        scenes.put(name, scene);
        System.out.println(name + " is registered");
    }

    public static void runScene(String name) {
        Scene scene = scenes.get(name);
        if(scene == null) {
            System.out.println("Scene not found of: " + name);
            return;
        }

        scene.Play();
  
    }
}
