package main;

import classObjectsThis.VideoGame;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<String> characters = new ArrayList<>();
        VideoGame marioBros2 = new VideoGame("mario 2", "old school", 0, 20, characters);
        System.out.println(marioBros2);
        System.out.println(marioBros2.isOn());
        marioBros2.play();
        System.out.println(marioBros2.isOn());

        VideoGame splinterCell = new VideoGame("Splinter Cell", "old school", 0, 20, characters);
        System.out.println(splinterCell);

    }
}
