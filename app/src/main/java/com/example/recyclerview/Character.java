package com.example.recyclerview;

public class Character {
    private final String name;
    private final int imageSrc;
    //private final String price;

    public Character(String name, int imageSrc) {
        this.name = name;
        this.imageSrc = imageSrc;
      //  this.price = price;
    }


//    public String getPrice() {
    //    return price;
  //  }

    public String getName() {
        return name;
    }

    public int getImageSrc() {
        return imageSrc;
    }
}
