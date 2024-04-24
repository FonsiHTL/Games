package at.leander.games.firstgame;

import org.newdawn.slick.*;

public class ObjectGames extends BasicGame {



    private Rectangle rectangle;

    private Circle circle;
    private Oval oval;



    public ObjectGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

     this.rectangle = new Rectangle(100, 100, 5, 1);
     this.circle = new Circle(100,100,8,1);
     this.oval = new Oval(150,120,3,1);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.rectangle.update(delta);
        this.circle.update(delta);
        this.oval.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


           this.rectangle.render(graphics);
            this.circle.render(graphics);
            this.oval.render(graphics);


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
