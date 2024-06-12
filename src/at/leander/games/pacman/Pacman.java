package at.leander.games.pacman;

import org.newdawn.slick.*;

public class Pacman implements Actor {

    private Image pacmanImage;
    private float x;
    private float y;
    private int speed;
    private PlayingField playingField;

    public Pacman(float x, float y, int speed, PlayingField playingField) throws SlickException {

        this.x = x;
        this.y = y;
        this.speed = speed;
        this.playingField = playingField;

        Image tmp = new Image("testdata/pacman.png");
        this.pacmanImage = tmp.getScaledCopy(80, 80);
    }


    @Override
    public void render(Graphics graphics) {
        pacmanImage.draw(this.x, this.y);
    }


    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x += (float) delta / this.speed;
           /* if(playingField.getGrid().length;)
        }*/

            if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
                this.x -= (float) delta / this.speed;
                if (this.x >= 600 || this.y >= 700 || this.y <= 20 || this.x <= 10) {
                    this.x = 300;
                    this.y = 300;
                }
            }
            if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
                this.y -= (float) delta / this.speed;
                if (this.x >= 600 || this.y >= 700 || this.y <= 20 || this.x <= 0) {
                    this.x = 300;
                    this.y = 300;
                }
            }
            if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
                this.y += (float) delta / this.speed;
                if (this.x >= 600 || this.y >= 700 || this.y <= 0 || this.x <= 0) {
                    this.x = 300;
                    this.y = 300;
                }
            }


        }
    }
}
