package com.GameEngine.Utils;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class SuperImage {
    private final List<Image> images = new ArrayList<>();
    private int imageSelected;

    public SuperImage(){}
    public SuperImage(String url){
        this.add(url);
    }
    public SuperImage(String url, double width, double height){
        this.add(url, width, height);
    }

    public Image get(){
        return this.images.get(this.imageSelected);
    }

    public void set(int index){
        this.imageSelected = index>=this.images.size()?0:index;
    }

    public void nextImage(){
        this.set(this.imageSelected+1);
    }

    public int getIndex(){return this.imageSelected;}

    public void add(String url, double width, double height){
        this.images.add(SecureImage.loadImage(url, width, height));
        this.imageSelected = this.images.size()-1;
    }

    public void add(String url){
        this.images.add(SecureImage.loadImage(url));
        this.imageSelected = this.images.size()-1;
    }
}
