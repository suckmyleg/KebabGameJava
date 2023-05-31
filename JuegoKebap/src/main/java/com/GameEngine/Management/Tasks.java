package com.GameEngine.Management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Class to recollect the actions needed in SceneManager from Backgrounds
 * @author suckmyleg
 * @version 1.0
 */
public class Tasks {
    private final HashMap<String, List<String>> content = new HashMap<>();
    public void activateScene(String scene){
        add("activateScene", scene);
    }
    public void startScene(String scene){
        add("startScene", scene);
    }
    public void removeObject(String object){
        add("removeObject", object);
    }

    public void add(String name, String value){
        List<String> list;
        if(this.content.get(name)==null){
            list = new ArrayList<>();
        }else{
            list = this.content.get(name);
        }

        list.add(value);
        this.content.put(name, list);
    }
    public List<String> get(String name){return this.content.get(name);}
    public List<String> getQueues(String name){
        return this.content.get(name);
    }

    public HashMap<String, List<String>> getContent(){return this.content;}
}
