package at.leander.games.pacman;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGames extends BasicGame {

    private List<Actor> actors;

    public static int SCREEN_HEIGHT = 800;
    public static int SCREEN_WIDTH = 800;



    public ObjectGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.actors = new ArrayList<>();
        Random random = new Random();

       PlayingField playingField = new PlayingField();
       this.actors.add(playingField);

       Pacman pacman = new Pacman(40,40, 3, playingField);
       this.actors.add(pacman);
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

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGames("ObjectGames"));
            container.setDisplayMode(SCREEN_WIDTH,SCREEN_HEIGHT,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
