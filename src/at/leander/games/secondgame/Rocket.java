package at.leander.games.secondgame;

import org.newdawn.slick.*;

public class Rocket implements Actor {
    private Image rocketImage;
    private float x;
    private float y;
    //private int rocketDirection;

    private int speed;




    public Rocket(float x, float y, int speed/*,*int rocketDirection*/) throws SlickException {

        this.x = x;
        this.y = y;
        //this.rocketDirection = rocketDirection;
        this.speed = speed;

        Image tmp = new Image("testdata/rocket.png");
        this.rocketImage = tmp.getScaledCopy(80, 80);
    }


    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x, this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

        if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += (float) delta / this.speed;
            if(this.x >= 600 || this.y >= 700 || this.y <= 20 || this.x <= 10){
                this.x = 300;
                this.y = 300;
            }
        }

        if(gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float) delta / this.speed;
            if(this.x >= 600 || this.y >= 700 || this.y <= 20 || this.x <= 10){
                this.x = 300;
                this.y = 300;
            }
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y -= (float) delta / this.speed;
            if(this.x >= 600 || this.y >= 700 || this.y <= 20 || this.x <= 0){
                this.x = 300;
                this.y = 300;
            }
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y += (float) delta / this.speed;
            if(this.x >= 600 || this.y >= 700 || this.y <= 0 || this.x <= 0){
                this.x = 300;
                this.y = 300;
            }
        }
    }

    public Image getRocketImage() {
        return rocketImage;
    }

    public void setRocketImage(Image rocketImage) {
        this.rocketImage = rocketImage;
    }

    public float getX() {
        return x + 32;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y - 30;
    }

    public void setY(float y) {
        this.y = y;
    }

   /* public int getRocketDirection() {
        return rocketDirection;
    }

    public void setRocketDirection(int rocketDirection) {
        this.rocketDirection = rocketDirection;
    }
    */


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}