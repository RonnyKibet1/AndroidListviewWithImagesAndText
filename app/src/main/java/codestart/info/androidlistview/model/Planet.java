package codestart.info.androidlistview.model;

/**
 * Created by ronnykibet on 11/14/17.
 */

public class Planet {

    private int image;
    private String name;

    public Planet() {
    }

    public Planet(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
