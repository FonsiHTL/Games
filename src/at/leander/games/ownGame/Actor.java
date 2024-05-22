package at.leander.games.ownGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface Actor {
    public void render(Graphics graphics);


    public void update(GameContainer gameContainer, int delta) throws SlickException;


}
