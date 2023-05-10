package com.GameEngine.Utils;

import javafx.scene.input.MouseEvent;

public class MouseEvents {
    private MouseEvent click;
    private MouseEvent move;

    public void setClick(MouseEvent click){this.click = click;}
    public void setMove(MouseEvent move){this.move = move;}
    public MouseEvent getClick(){return this.click;}
    public MouseEvent getMove(){return this.move;}
}
