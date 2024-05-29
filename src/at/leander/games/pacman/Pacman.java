package at.leander.games.pacman;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Pacman implements Actor {

    private int x ;
    private int y ;
    private int speed;

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(int delta) {
      /*  if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
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
        }*

       */
    }}

