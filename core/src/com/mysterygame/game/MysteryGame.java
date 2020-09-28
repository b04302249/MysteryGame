package com.mysterygame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mysterygame.game.screens.MenuScreen;

public class MysteryGame extends Game {

	MenuScreen menuScreen;

	
	@Override
	public void create () {
		this.menuScreen = new MenuScreen(this);

	}

	@Override
	public void render () {


	}
	
	@Override
	public void dispose () {

	}
}
