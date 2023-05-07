package com.GameEngine.Stages;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Backgrounds.Tasks;
import com.GameEngine.Maps.Map;
import com.GameEngine.Maps.Map2D;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.Object2d;
import com.GameEngine.Utils.SecureImage;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;


/**
 * That storages the Objects and Background in the scene needed to execute
 * @author suckmyleg
 * @version 1.0
 */
public class Stage {
    protected final String name;
    protected Stadistics stats;
    protected Map map;
    protected List<Background> backgrounds = new ArrayList<>();
    protected final Image backgroundImage;

    public void Start(){
        System.out.println("+"+this.name+" scene");
    }

    public void Stop(){
        System.out.println("-"+this.name+" scene");
    }

    public void Activate() { this.stats = new Stadistics(); }

    public void RunObjects(Stadistics gameStats){
        List<Object2d> objects = this.map.getObjects();
        objects.forEach(x -> x.Run(new GameContent(this.map.getObjects(), gameStats, this.stats, x)));
    }

    public Tasks RunBackgrounds(Stadistics gameStats){
        Tasks tasks = new Tasks();
        this.backgrounds.forEach(x -> x.Run(this.backgrounds, gameStats, this.stats, tasks));
        return tasks;
    }


    public Stage(String name, String background, int w, int h){
        this.stats = new Stadistics();
        this.backgroundImage = SecureImage.loadImage(background, w, h);
        this.name = name;
        this.map = new Map2D();
    }

    public Stage(String name, String background){
        this.stats = new Stadistics();
        this.backgroundImage = SecureImage.loadImage(background);
        this.name = name;
        this.map = new Map2D();
    }

    public Stage(String name){
        this.stats = new Stadistics();
        this.backgroundImage = SecureImage.loadImage("NoImage");
        this.name = name;
        this.map = new Map2D();
    }

    public List<Object2d> objectsToDraw(){
        return this.map.getObjects();
    }

    public String getName(){
        return this.name;
    }
    public Image getBackground(){return this.backgroundImage;}

    public void clearObjects(){
        this.map.removeAll();
    }
    public void clearBackgrounds(){
        this.backgrounds = new ArrayList<>();
    }
    public void addObject(Object2d o){
        this.map.add(o);
        System.out.println("Added object\n"+o);
    }
    public void addBackground(Background b){
        this.backgrounds.add(this.backgrounds.size(), b);
    }
}
