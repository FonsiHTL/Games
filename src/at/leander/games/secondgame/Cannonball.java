package at.leander.games.secondgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Cannonball implements Actor{

    private float x;
    private float y;
    public Cannonball() {
        super();
    }

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, 10,10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y --;
    }
}
