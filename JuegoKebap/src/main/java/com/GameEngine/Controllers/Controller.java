package com.GameEngine.Controllers;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.Sprite;

public interface Controller {
    public void Run(GameContent content);
    public void Start(Sprite o);
}
