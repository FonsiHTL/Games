package at.leander.games.firstgame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {

    private float x;
    private float y;
    private float speed;
    private int circleDirection;
    private float diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(600);
        this.y = random.nextInt(600);
        this.speed = 50;
        this.diameter = 30;
        this.circleDirection = 1;
    }

    public Circle(int x, int y, float speed, float diameter, int circleDirection) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
        this.circleDirection = circleDirection;

    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    public void update(int delta) {

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

        if (circleDirection == 1) {
            this.diameter += 0.005;
        }

    }
}
