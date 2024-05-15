package at.leander.games.secondgame;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGamesMain extends BasicGame {
    private Rocket rocket;
    private List<Actor> actors;


    public ObjectGamesMain(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.actors = new ArrayList<>();
        Random random = new Random();

            Rocket rocket = new Rocket
                    (200, 300, 5/*,  1*/);
            this.rocket = rocket;
            this.actors.add(rocket);


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor: this.actors) {
            actor.update(gameContainer, delta);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor:this.actors) {
            actor.render(graphics);
        }

    }

    @Override
    public void keyPressed(int key, char c) {
        if(key == Input.KEY_SPACE){
            System.out.println("shoot");
            Cannonball cannonball = new Cannonball(this.rocket.getX(), this.rocket.getY());
            this.actors.add(cannonball);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGamesMain("ObjectGamesMain"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
