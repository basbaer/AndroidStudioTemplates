package com.basbaer.myflappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyFlappyBird extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background;

	@Override
	public void create () {
		batch = new SpriteBatch();

		//get the image for the background
		background = new Texture("bg.png");

	}

	@Override
	public void render () {

		//doing something, when the screen is touched
		//is true, when the screen is touched
		if(Gdx.input.justTouched()){

			Gdx.app.log("Touched", "Yep");


		}

		//telling the render method, that we start to display sprites
		batch.begin();

		//display the background
		//parameters: image, x-coordinate, y-coordinate, width, height
		batch.draw(background, 0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		//tell the method, that we are done with the sprites
		batch.end();

		//<display a font>
		BitmapFont font = new BitmapFont();
		font.setColor(Color.BLUE);
		font.getData().setScale(10);

		//normally you only do this in the render method and the rest in the create method
		font.draw(batch, String.valueOf(score), 80, 150);

		//</display a font>





	}

	@Override
	public void dispose () {
		batch.dispose();
		background.dispose();
	}
}
