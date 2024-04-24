package at.leander.games.firstgame;

import org.newdawn.slick.Graphics;

public class Oval {
    private float x;
    private float y;
    private float speed;
    private int ovalDirection;

    public Oval(int x, int y, float speed, int ovalDirection) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.ovalDirection = ovalDirection;

    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x,this.y, 50,30);
    }

    public void update(int delta){
        if (ovalDirection == 1) {
            this.x += (float) delta / this.speed;
            if (this.x > 500) {
                ovalDirection = -1;
            }
        } else {

            this.x -= (float) delta / this.speed;
            if (this.x < 10) {
                ovalDirection = 1;
            }
        }


    }
}
