package com.GameEngine.Backgrounds;

import java.util.HashMap;

/**
 * Class to recollect the actions needed in SceneManager from Backgrounds
 * @author suckmyleg
 * @version 1.0
 */
public class Tasks {
    private HashMap<String, String> content = new HashMap();
    public void activateScene(String scene){
        content.put("activateScene", scene);
    }
    public void startScene(String scene){
        content.put("startScene", scene);
    }

    public void queueTask(String name, String value){this.content.put(name, value);}

    public HashMap getContent(){return content;}
}
