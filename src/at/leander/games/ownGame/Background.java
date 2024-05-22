package at.leander.games.ownGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Background implements Actor {
    private Image backgroundImage;


    public Background() {
        super();
    }

    public Background(Image backgroundImage) throws SlickException {
        Image tmp = new Image("testdata/flappyBirdBackground.jpeg");
        this.backgroundImage = tmp.getScaledCopy(ObjectGamesMain.SCREEN_WIDTH, ObjectGamesMain.SCREEN_HEIGHT);

    }

    @Override
    public void render(Graphics graphics) {
        backgroundImage.draw(ObjectGamesMain.SCREEN_HEIGHT, ObjectGamesMain.SCREEN_WIDTH);
    }



    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
}
