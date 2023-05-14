package com.example.greenspace;

public class Groups {
    private String name;
//    private int imageUrl;
    private int titleImage;

    public Groups(String name, int titleImage) {
        this.name = name;
        this.titleImage = titleImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTitleImage() {
        return titleImage;
    }


//    public int getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(int imageUrl) {
//        this.imageUrl = imageUrl;
//    }

    @Override
    public String toString() {
        return "Groups{" +
                "name='" + name + '\'' +
                "titleImage='" + titleImage + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
