package at.leander.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {

    private int  x;
    private int y;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    this.x = 100;
    this.y = 50;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x ++;
        this. y ++;
        if (x>800) {
            this.y = 0;
            this.x = 0;

        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
            graphics.drawRect(this.x, this.y, 100, 100);
            graphics.drawString("Hallo", 100, 100);
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
