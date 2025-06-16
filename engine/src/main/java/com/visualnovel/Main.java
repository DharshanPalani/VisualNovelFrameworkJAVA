package com.visualnovel;

public class Main {
    public static void main(String[] args) {
        Engine.scene("intro", () -> {
            Engine.say("Luna", "Just kill yourself already...");
        });

        Engine.run("intro");
    }
}