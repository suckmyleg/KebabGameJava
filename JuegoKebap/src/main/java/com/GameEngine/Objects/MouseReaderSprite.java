package com.GameEngine.Objects;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Utils.MouseEvents;
import com.GameEngine.Vectors.Vector;
import javafx.scene.input.MouseEvent;

public class MouseReaderSprite extends ClickableSprite {
    public MouseReaderSprite(Vector position, Vector size) {
        super(position, size);
    }

    public MouseReaderSprite(String url, Vector position, Vector size) {
        super(url, position, size);
    }

    public MouseReaderSprite(String url, Vector position) {
        super(url, position);
    }

    public MouseReaderSprite(Vector position) {
        super(position);
    }

    public MouseReaderSprite(String url) {
        super(url);
    }

    public MouseReaderSprite() {
    }

    public void mouseMoved(MouseEvent mouse){
    }

    public void Run(GameContent content){
        super.Run(content);
        MouseEvent mouse = content.getMouse().getClick();
        if(mouse!=null && this.clickCollission(mouse)){
            this.onClicked();
        }
        mouse = content.getMouse().getMove();
        if(mouse != null) this.mouseMoved(mouse);

    }
}
