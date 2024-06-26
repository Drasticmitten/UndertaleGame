package com.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;

import static com.game.Undertale.shapeRenderer;

public class AlertBox extends Actor {
    private final Color borderColor = Color.RED;

    public AlertBox(float width, float height, float x, float y) {
        setWidth(width);
        setHeight(height);
        setX(x); setY(y);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(borderColor);
        Gdx.gl20.glLineWidth(2f);
        shapeRenderer.rect(getX(), getY(), getWidth(), getHeight());
        shapeRenderer.end();
    }
}
