package com.example.recyclerview;

public class Character {
    private final String name;
    private final int imageSrc;
    private final String description;
    //private final String price;

    public Character(String name, int imageSrc, String description) {
        this.name = name;
        this.imageSrc = imageSrc;
        this.description = description;
    }



//    public String getPrice() {
    //    return price;
  //  }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageSrc() {
        return imageSrc;
    }
}
