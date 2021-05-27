package com.learning.tourbareilly;

class Attractions {
    private int image;
    private String name;
    private String short_description;

    public Attractions(int image, String name, String short_description) {
        this.image = image;
        this.name = name;
        this.short_description = short_description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return short_description;
    }
}
