package com.basbaer.myflappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyFlappyBird extends ApplicationAdapter {
	SpriteBatch batch;
	ShapeRenderer shapeRenderer;


	Circle circleForObject;
	Rectangle rectangleForObject;



	@Override
	public void create () {
		batch = new SpriteBatch();


		shapeRenderer = new ShapeRenderer();
		circleForObject = new Circle();
		rectangleForObject = new Rectangle();

	}

	@Override
	public void render () {


		//create a shapes around the object
		circleForObject.set(<x-coordinate of center of circle>, <y-coordinat of cencter of circle>, <radius of circle>);
		rectangleForObject.set(<x-coordinate of center of rectangle>, <y-coordinat of cencter of rectangle>, <width of rectangle>, <height of rectangle>)

		if(Intersector.overlaps(circleForObject, rectangleForObject){

				Gdx.app.log("Collision", "Yes");

		}

		//is only needed to show the shapes
		/*
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.circle(circleForObject.x, circleForObject.y, circleForObject.radius);
		shapeRenderer.rect(rectangleForObject.x, rectangleForObject.y, rectangleForObject.width, rectangleForObject.height)
		shapeRenderer.end();
		*/



	}

	@Override
	public void dispose () {
		batch.dispose();

	}
}
