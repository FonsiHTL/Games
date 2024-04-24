package at.leander.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import javax.swing.*;

public class Rectangle extends BasicGame {

    private int circleDirection;
    private int ovalDirection;

    private int rectDirection;

    private float xRect;
    private float yRect;
    private float xOval;
    private float yOval;

    private float xCircle;

    private float yCircle;




    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    this.xRect = 50;
    this.yRect = 50;
    this.xOval = 50;
    this.yOval = 50;
    this.xCircle = 100;
    this.yCircle = 50;
    this.circleDirection = 1;
    this.ovalDirection = 1;
    this.rectDirection = 1;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if(rectDirection == 1) {
            this.xRect += (float) delta * 0.1;
            if(this.xRect >= 600){
                this.xRect = 600;
                rectDirection = 2;
            }
        }

       if(rectDirection == 2) {
           this.yRect += (float) delta * 0.1;
           if(this.yRect >= 450){
               this.yRect = 450;
               rectDirection = 3;
           }
       }

       if(rectDirection == 3) {
           this.xRect -= (float) delta * 0.1;
           if(this.xRect <= 10){
               this.xRect = 10;
               rectDirection = 4;
           }
       }

       if(rectDirection == 4) {
           this.yRect -= (float) delta * 0.1;
           if(this.yRect <= 20){
               this.yRect = 20;
               rectDirection = 1;
           }
       }

        if (ovalDirection == 1) {
            this.xOval += (float) delta * 0.1;
            if (xOval > 500) {
                ovalDirection = -1;
            }
        } else {

            this.xOval -= (float) delta * 0.1;
            if (this.xOval < 10) {
                ovalDirection = 1;
            }
        }


        if (circleDirection == 1) {
            this.yCircle += (float) delta * 0.1;
            if (yCircle > 500) {
                circleDirection = -1;
            }
        } else {

            this.yCircle -= (float) delta * 0.1;
            if (this.yCircle < 10) {
                circleDirection = 1;
            }
        }







    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
            graphics.drawRect(this.xRect, this.yRect, 100, 100);
            graphics.drawString("Hallo", 100, 100);
            graphics.drawOval(this.xOval, this.yOval, 100, 50);
            graphics.drawOval(this.xCircle, this.yCircle, 100, 100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
