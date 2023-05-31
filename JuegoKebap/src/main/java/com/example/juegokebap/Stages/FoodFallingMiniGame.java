package com.example.juegokebap.Stages;

import com.GameEngine.Management.StageBridge;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Backgrounds.FoodFalling;
import com.example.juegokebap.Backgrounds.FriesFalling;
import com.example.juegokebap.Objects.MouseFollower;

import java.util.List;


/**
 * Game stage, it creates a background controller that creates objects that falls and if the player
 * doesn't grab an amount, the game stops as lost and if he lasts until the end, the game stops as won
 * @author suckmyleg
 * @version 1.0
 */

public class FoodFallingMiniGame extends Stage {
    public FoodFallingMiniGame() {
        super("FriesMiniGame", "MiniGames/backFries.png");
    }


    /**
     * When the stage its activated, clear all and run background controlled, if the mode is plate run FriesFalling
     * if its box, run FoodFalling
     */
    @Override
    public Tasks Activate(StageBridge bridge, Tasks tasks){
        clearBackgrounds();
        clearObjects();

        if(bridge.getData("difficulty") == null)
        {
            tasks.activateScene("SelectDifficulty");
        }else{
            if(bridge.getData("mode").get(0).equals("Plate")){
                addBackground(new FriesFalling(bridge.getData("difficulty").get(0)));
                bridge.removeData("difficulty");
            }else{
                addBackground(new FoodFalling(bridge.getData("difficulty").get(0)));
                bridge.removeData("difficulty");
            }
        }

        return tasks;
    }
}
