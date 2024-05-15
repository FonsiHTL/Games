package at.leander.games.secondgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rocket implements Actor {
    private Image rocketImage;
    private float x;
    private float y;
    private int rocketDirection;

    private int speed;


    public Rocket(float x, float y, int speed, int rocketDirection) throws SlickException {

        this.x = x;
        this.y = y;
        this.rocketDirection = rocketDirection;
        this.speed = speed;

        Image tmp = new Image("testdata/rocket.png");
        this.rocketImage = tmp.getScaledCopy(50, 50);
    }


    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x, this.y);
    }

    @Override
    public void update(int delta) {

        if (rocketDirection == 1) {
            this.x += (float) delta / this.speed;
            if (this.x >= 600) {
                this.x = 600;
                rocketDirection = 2;

            }
        }


        if (rocketDirection == 2) {
            this.y += (float) delta / this.speed;
            if (this.y >= 450) {
                this.y = 450;
                rocketDirection = 3;
            }
        }


        if (rocketDirection == 3) {
            this.x -= (float) delta / this.speed;
            if (this.x <= 10) {
                this.x = 10;
                rocketDirection = 4;
            }
        }


        if (rocketDirection == 4) {
            this.y -= (float) delta / this.speed;
            if (this.y <= 20) {
                this.y = 20;
                rocketDirection = 1;
            }
        }

    }
}