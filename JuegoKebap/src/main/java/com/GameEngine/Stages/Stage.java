package com.GameEngine.Stages;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Management.StageBridge;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Maps.Map;
import com.GameEngine.Maps.Map2D;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Utils.MouseEvents;
import com.GameEngine.Utils.SecureImage;
import com.GameEngine.Vectors.Vector;
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
    private Vector size;

    /**
     * When the stage has been added to the list of stages
     */
    public void Start(StageBridge bridge){
        System.out.println("+"+this.name+" scene");
    }

    /**
     * When the stage has been stopped
     */
    public void Stop(){
        System.out.println("-"+this.name+" scene");
    }

    /**
     * When the stage has been activated
     */
    public Tasks Activate(StageBridge bridge, Tasks tasks) {
        this.stats = new Stadistics();
        return tasks;
    }

    /**
     * Run all objects from the world
     */
    public Tasks RunObjects(Stadistics gameStats, MouseEvents mouseEvents, StageBridge bridge){

        Tasks tasks = new Tasks();
        List<ControllableSprite> objects = this.map.getObjects();
        objects.forEach(x -> x.Run(new GameContent(this.map.getObjects(), gameStats, this.stats, x, mouseEvents, tasks, this, bridge)));
        return tasks;
    }

    /**
     * Run all backgrounds controllers
     */
    public Tasks RunBackgrounds(Stadistics gameStats){
        Tasks tasks = new Tasks();
        this.backgrounds.forEach(x -> x.Run(this.map.getObjects(), gameStats, this.stats, tasks, this));
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
        this.backgroundImage = SecureImage.loadImage("");
        this.name = name;
        this.map = new Map2D();
    }

    /**
     * Gets all objects that needs to be showed in the screen
     */
    public List<ControllableSprite> objectsToDraw(){
        return this.map.getObjects();
    }

    /**
     * get name of the stage
     */
    public String getName(){
        return this.name;
    }


    /**
     * Get background image
     */
    public Image getBackground(){return this.backgroundImage;}

    /**
     * Get backgroundSize
     */
    public Vector getSize(){return size;}

    /**
     * Remove all objects from the world
     */
    public void clearObjects(){
        this.map.removeAll();
    }

    /**
     * Run all backgrounds controllers
     */
    public void clearBackgrounds(){
        this.backgrounds = new ArrayList<>();
    }

    /**
     * Add object to the world, and start he object
     */
    public void addObject(ControllableSprite o){
        this.map.add(o);
        o.Start(o);
    }

    /**
     * Remove object from the world with the objectKey
     */
    public void removeObject(String objectString){
        this.map.remove(objectString);
    }


    /**
     * Add background controller
     */
    public void addBackground(Background b){
        this.backgrounds.add(this.backgrounds.size(), b);
        b.Start(this);
    }
}
