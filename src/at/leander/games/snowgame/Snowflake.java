package at.leander.games.snowgame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Snowflake implements Actor{


    public enum SIZE {BIG, SMALL, MEDIUM};
    private float x, y;
    private int size;
    private int speed;
    private Random random;


    public Snowflake(SIZE size){
        this.random = new Random();
        if (size == SIZE.BIG){
            this.size = 13;
            this.speed = 2;
        }

        if (size == SIZE.MEDIUM){
            this.size = 8;
            this.speed = 6;
        }

        if (size == SIZE.SMALL){
            this.size = 6;
            this.speed = 4;
        }
        setRandomPosition();
    }

    private void setRandomPosition(){
        this.x = this.random.nextInt(Snowworld.SCREEN_WIDTH);
        this.y = this.random.nextInt(Snowworld.SCREEN_HEIGTH) - Snowworld.SCREEN_HEIGTH;
    }

    @Override
    public void render(Graphics graphics){
        graphics.fillOval(this.x,this.y,this.size,this.size);
    }

    @Override
    public void update(int delta){
        this.y += (float)delta / this.speed;
        if (this.y >  Snowworld.SCREEN_HEIGTH){
            setRandomPosition();
        }

    }


}
