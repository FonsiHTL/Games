package at.leander.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGames extends BasicGame {

    private List<Actor> actors;





    public ObjectGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.actors = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle
                    (random.nextInt(600), random.nextInt(600), random.nextInt(50), 1);
            this.actors.add(rectangle);
        }


        for (int i = 0; i < 200; i++) {
            Circle circle = new Circle
                    (random.nextInt(500), random.nextInt(600), random.nextInt(120), 2);
            this.actors.add(circle);
        }


        for (int i = 0; i < 100; i++) {
            Oval oval = new Oval
                    (random.nextInt(500), random.nextInt(700), random.nextInt(500), 1);
            this.actors.add(oval);

        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor: this.actors) {
            actor.update(delta);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        for (Actor actor:this.actors) {
            actor.render(graphics);
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
