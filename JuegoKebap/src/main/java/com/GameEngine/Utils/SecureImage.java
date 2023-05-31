package com.GameEngine.Utils;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Objects;


/**
 * Secured way of importing images from img folder
 * @author suckmyleg
 * @version 1.0
 */
public final class SecureImage{
    private static final HashMap<String, Image> images = new HashMap<>();

    /**
     * Load image and if an error occurs return default error image
     */
    static public Image loadImage(String url, double width, double height){
        if(images.containsKey(url)) return images.get(url);
        Image img;
        try{
            img = new Image("file:src/img/"+url, width, height, false, false);
            if(img.getHeight() == 0 || img.getWidth() == 0){
                System.out.println("Error loading image: " + (Objects.equals(url, "") ?"No url":url));
                img = new Image("file:src/img/Basic/error.png", width, height, false, false);
            }
        }catch (Exception e){
            img = new Image("file:src/img/Basic/error.png", width, height, false, false);
        }
        images.put(url, img);
        return img;
    }

    /**
     * Load image and if an error occurs return default error image
     */
    static public Image loadImage(String url){
        if(images.containsKey(url)) return images.get(url);
        Image img;
        try{
            img = new Image("file:src/img/"+url);
            if(img.getHeight() == 0 || img.getWidth() == 0){
                System.out.println("Error loading image: " + (Objects.equals(url, "") ?"No url":url));
                img = new Image("file:src/img/Basic/error.png");
            }
        }catch (Exception e){
            img = new Image("file:src/img/Basic/error.png");
        }
        images.put(url, img);
        return img;
    }

}
