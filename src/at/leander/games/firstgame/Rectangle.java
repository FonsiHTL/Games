package at.leander.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {

    private float  xRect;
    private float yRect;
    private float xOval;
    private float yOval;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    this.xRect = 100;
    this.yRect = 50;
    this.xOval = 100;
    this.yOval = 0;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.xRect += (float)delta/20.0;

        this.yRect += (float)delta/40.0;
        if (xRect>800) {
            this.yRect = 0;
            this.xRect = 0;

        }

        this.xOval += (float) delta * 0.1;

        if(xOval>800) {
            this.yOval = 0;
            this.xOval = 0;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
            graphics.drawRect(this.xRect, this.yRect, 100, 100);
            graphics.drawString("Hallo", 100, 100);
            graphics.drawOval(this.xOval, this.yOval, 100, 100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
