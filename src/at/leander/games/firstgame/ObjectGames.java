package at.leander.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGames extends BasicGame {

    private List<Rectangle> rectangles;

    private List<Circle> circles;
    private List<Oval> ovals;



    public ObjectGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.rectangles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle
                    (random.nextInt(600), random.nextInt(600), random.nextInt(50), 1);
            rectangles.add(rectangle);
        }

        this.circles = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Circle circle = new Circle
                    (random.nextInt(500), random.nextInt(600), random.nextInt(120), 2);
            circles.add(circle);
        }
        this.ovals = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Oval oval = new Oval
                    (random.nextInt(500), random.nextInt(700), random.nextInt(500), 1);
            ovals.add(oval);

        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Rectangle rectangle: this.rectangles) {
            rectangle.update(delta);
        }
        for (Circle circle: this.circles) {
            circle.update(delta);

        }
        for (Oval oval: this.ovals) {
            oval.update(delta);

        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        for (Rectangle rectangle:this.rectangles) {
            rectangle.render(graphics);
        }
        for (Circle circle :this.circles) {
            circle.render(graphics);

        }
        for (Oval oval :this.ovals) {
            oval.render(graphics);

        }



    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGames("ObjectGames"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
