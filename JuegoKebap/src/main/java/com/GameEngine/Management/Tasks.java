package com.GameEngine.Management;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Class to recollect the actions needed in SceneManager from Backgrounds
 * @author suckmyleg
 * @version 1.0
 */
public class Tasks {
    private final HashMap<String, String> content = new HashMap();
    public void activateScene(String scene){
        content.put("activateScene", scene);
    }
    public void startScene(String scene){
        content.put("startScene", scene);
    }
    public void removeObject(String object){
        content.put("removeObject", object);
    }

    public void queueTask(String name, String value){this.content.put(name, value);}
    public void addToQueue(String name, String value){
        this.content.put(name, this.content.get(name)==null?value:(this.content.get(name).toString()+","+value));
    }
    public String get(String name){return this.content.get(name);}
    public List<String> getQueues(String name){
        return Arrays.stream(this.content.get(name).split(",")).toList();
    }

    public HashMap getContent(){return content;}
}
