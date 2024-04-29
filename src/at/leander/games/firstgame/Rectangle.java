package at.leander.games.firstgame;

import org.newdawn.slick.Graphics;

import java.awt.*;

public class Rectangle implements Actor {
    private float x;
    private float y;
    private float speed;
    private int rectDirection;

    public Rectangle(int x, int y, float speed, int rectDirection) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.rectDirection = rectDirection;

    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y, 30,30);
    }

    public void update(int delta){


        if(rectDirection == 1) {
            this.x += (float) delta / this.speed;
            if(this.x >= 600){
                this.x = 600;
                rectDirection = 2;
            }
        }

        if(rectDirection == 2) {
            this.y += (float) delta / this.speed;
            if(this.y >= 450){
                this.y = 450;
                rectDirection = 3;
            }
        }

        if(rectDirection == 3) {
            this.x -= (float) delta / this.speed;
            if(this.x <= 10){
                this.x = 10;
                rectDirection = 4;
            }
        }

        if(rectDirection == 4) {
            this.y -= (float) delta / this.speed;
            if(this.y <= 20){
                this.y = 20;
                rectDirection = 1;
            }
        }
    }
}
