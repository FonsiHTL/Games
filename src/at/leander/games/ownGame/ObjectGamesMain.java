package at.leander.games.ownGame;



import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGamesMain extends BasicGame {

      /*Idee: "Flappy Bird" als Spiel, bei dem Der Vogel nicht an die Säulen geraten darf
     */

    private List<Actor> actors;

    private Background background;

    public static int SCREEN_WIDTH = 1200;;
    public static int SCREEN_HEIGHT = 1200;


    public ObjectGamesMain(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.actors = new ArrayList<>();

        Background background = new Background();

        this.background = background;
        this.actors.add(background);


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor:this.actors) {
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

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.leander.games.ownGame.ObjectGamesMain("ObjectGamesMain"));
            container.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
