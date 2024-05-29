package at.leander.games.pacman;

import org.newdawn.slick.Graphics;

import java.util.Arrays;

public class PlayingField implements Actor {

    public static int GRID = 40;
    private int[][] grid;


    public PlayingField() {

        grid = new int[][]{
            //   0, 1, 2, 3, 4, 5, 6, 7, 8
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //0
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //1
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //2
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //3
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //4
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //5
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //6
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //7
                {0, 0, 0, 0, 0, 0, 0, 0, 0},   //8
        };


        for (int[] ints : grid) {
            Arrays.fill(ints, 0);
        }
    }

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(int delta) {

    }
}
