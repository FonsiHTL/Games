package at.leander.games.firstgame;

import org.newdawn.slick.Graphics;

public class Circle implements Actor{

    private float x;
    private float y;
    private float speed;
    private int circleDirection;

    public Circle(int x, int y, float speed, int circleDirection) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.circleDirection = circleDirection;

    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x,this.y, 25,25);
    }

    public void update(int delta){

        if (circleDirection == 1) {
            this.y += (float) delta / this.speed;
            if (y > 500) {
                circleDirection = -1;
            }
        } else {

            this.y -= (float) delta / this.speed;
            if (this.y < 10) {
                circleDirection = 1;
            }
        }

    }
}
