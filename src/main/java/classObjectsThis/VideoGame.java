package classObjectsThis;

import java.util.ArrayList;

public class VideoGame {
    public String name;
    public String category;
    public int pgRating;
    public double price;
    public ArrayList<String> characters;
    public boolean isOnOrOff = false;

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
