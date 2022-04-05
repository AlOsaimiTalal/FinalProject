package com.example.demo;

public class itemData {

    private int img;
    private String description;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public itemData(int img, String description) {
        this.img = img;
        this.description = description;
    }
}
