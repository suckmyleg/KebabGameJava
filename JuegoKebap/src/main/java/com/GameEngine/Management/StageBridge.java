package com.GameEngine.Management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * StageBridge allows you to pass data from different stages
 * @author suckmyleg
 * @version 1.0
 */
public class StageBridge {
    private final HashMap<String, List<String>> content = new HashMap<>();


    /**
     * Remove all data with that name
     */
    public void removeData(String name){
        this.content.remove(name);
    }


    /**
     * Append data
     */
    public void addData(String name, String value){
        List<String> list;
        if(this.content.get(name)==null){
            list = new ArrayList<>();
        }else{
            list = this.content.get(name);
        }

        list.add(value);
        this.content.put(name, list);
    }

    /**
     * Get all data added with that name
     */
    public List<String> getData(String name){return this.content.get(name);}
}
