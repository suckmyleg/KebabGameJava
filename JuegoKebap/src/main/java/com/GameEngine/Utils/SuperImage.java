package com.GameEngine.Utils;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that storages multiples images
 * @author suckmyleg
 * @version 1.0
 */
public class SuperImage {
    private final List<Image> images = new ArrayList<>();
    private int imageSelected;

    public SuperImage(){}
    public SuperImage(String url, double width, double height){
        this.add(url, width, height);
    }


    /**
     * Get the selected image
     */
    public Image get(){
        return this.images.get(this.imageSelected);
    }

    /**
     * Set selected image index
     */
    public void set(int index){
        this.imageSelected = index>=this.images.size()?0:index;
    }


    /**
     * Get index of the selected image
     */
    public int getIndex(){return this.imageSelected;}

    /**
     * Add image
     */
    public void add(String url, double width, double height){
        this.images.add(SecureImage.loadImage(url, width, height));
        this.imageSelected = this.images.size()-1;
    }

    /**
     * Add image
     */
    public void add(String url){
        this.images.add(SecureImage.loadImage(url));
        this.imageSelected = this.images.size()-1;
    }
}
