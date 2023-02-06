package classObjectsThis;

import java.util.ArrayList;

public class VideoGame {
    private String name;
    private String category;
    private int pgRating;
    private double price;
    private ArrayList<String> characters;
    private boolean isOnOrOff = false;

    public String cpr;

    public VideoGame(String name, String category, int pgRating, double price, ArrayList<String> characters) {
        this.name = name;
        this.category = category;
        this.pgRating = pgRating;
        this.price = price;
        this.characters = characters;
    }

    public boolean isOn(){
        if(isOnOrOff == true) {
            return true;
        } else {
            return false;
        }
    }

    public void play() {
        isOnOrOff = true;
        System.out.println(this.name + "is Playing");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", pgRating=" + pgRating +
                ", price=" + price +
                ", character=" + characters +
                '}';
    }


}
