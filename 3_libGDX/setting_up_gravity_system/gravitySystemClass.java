package com.basbaer.myflappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyFlappyBird extends ApplicationAdapter {
	SpriteBatch batch;

	Texture myObject;

	//set up a variable for the y-position and for the velocity (with which the sprite falls down)
	float myObjectY = 0;
	float downfallingVelocity = 0;
	int gravity = 2;


	@Override
	public void create () {
		batch = new SpriteBatch();

		myObject = new Texture("<src>");

		myObjectY = <starting position>;


	}

	@Override
	public void render () {

		//when the screen is touched, the object falls down
		if (Gdx.input.justTouched()) {

			downfallingVelocity += gravity;
			myObjectY -= downfallingVelocity;

		}


		batch.begin();

		//set the new postion
		batch.draw(myObject, <x-coordinate>, myObjectY);
		batch.end();


	}

	@Override
	public void dispose () {
		batch.dispose();

	}
}
