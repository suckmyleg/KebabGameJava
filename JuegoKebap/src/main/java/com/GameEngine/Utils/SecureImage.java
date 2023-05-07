package com.GameEngine.Utils;

import javafx.scene.image.Image;

import java.util.HashMap;

public final class SecureImage{
    private static final HashMap<String, Image> images = new HashMap<>();
    static public Image loadImage(String url, double width, double height){
        if(images.containsKey(url)) return images.get(url);
        Image img;
        try{
            img = new Image("file:src/img/"+url, width, height, false, false);
            if(img.getHeight() == 0 || img.getWidth() == 0){
                System.out.println("Error loading image: " + url);
                img = new Image("file:src/img/Basic/error.png", width, height, false, false);
            }
        }catch (Exception e){
            img = new Image("file:src/img/Basic/error.png", width, height, false, false);
        }
        images.put(url, img);
        return img;
    }

    static public Image preloadedImage(String url){
        return images.get(url);
    }

    static public Image loadImage(String url){
        if(images.containsKey(url)) return images.get(url);
        Image img;
        try{
            img = new Image("file:src/img/"+url);
            if(img.getHeight() == 0 || img.getWidth() == 0){
                System.out.println("Error loading image: " + url);
                img = new Image("file:src/img/error.png");
            }
        }catch (Exception e){
            img = new Image("file:src/img/error.png");
        }
        images.put(url, img);
        return img;
    }

}
