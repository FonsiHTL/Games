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
        this.pacmanImage = tmp.getScaledCopy(40, 40);
    }

    @Override
    public void render(Graphics graphics) {
        pacmanImage.draw(this.x, this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        float moveDistance = (float) delta / this.speed;
        float newX = this.x;
        float newY = this.y;

        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            newX += moveDistance;
        } else if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            newX -= moveDistance;
        } else if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
            newY -= moveDistance;
        } else if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
            newY += moveDistance;
        }


        if (canMoveTo(newX, newY)) {
            this.x = newX;
            this.y = newY;
        }
    }

    private boolean canMoveTo(float newX, float newY) {

        int gridX = (int) ((newX + pacmanImage.getWidth() / 2) / PlayingField.GRID_SIZE);
        int gridY = (int) ((newY + pacmanImage.getHeight() / 2) / PlayingField.GRID_SIZE);
        return isFreeCell(gridX, gridY);
    }

    private boolean isFreeCell(int gridX, int gridY) {

        if (gridX < 0 || gridX >= playingField.getGrid()[0].length || gridY < 0 || gridY >= playingField.getGrid().length) {
            return false;
        }

        return playingField.getGrid()[gridY][gridX] == 0;
    }
}
