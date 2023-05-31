package com.GameEngine.Utils;

import javafx.scene.input.MouseEvent;

/**
 * Storages the events from the mouse
 * @author suckmyleg
 * @version 1.0
 */
public class MouseEvents {
    private MouseEvent click;
    private MouseEvent move;

    /**
     * set clickData
     */
    public void setClick(MouseEvent click){this.click = click;}

    /**
     * set moveData
     */
    public void setMove(MouseEvent move){this.move = move;}

    /**
     * Get click data
     */
    public MouseEvent getClick(){return this.click;}

    /**
     * Get move data
     */
    public MouseEvent getMove(){return this.move;}
}
