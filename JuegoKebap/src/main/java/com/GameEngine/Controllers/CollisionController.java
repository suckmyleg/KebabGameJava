package com.GameEngine.Controllers;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.CollisionableSprite;

public interface CollisionController {
    public void Run(GameContent content, CollisionableSprite collisionTo);
    public void Start(CollisionableSprite o);
}
