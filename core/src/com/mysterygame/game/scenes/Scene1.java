package com.mysterygame.game.scenes;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mysterygame.game.Card;

public class Scene1 extends Stage {
    private Card card_1;
    private Card card_2;
    private Card card_3;
    private Card card_4;
    private Card card_5;

    public Scene1(Viewport viewport, Batch batch) {
        super(viewport, batch);
    }
}
