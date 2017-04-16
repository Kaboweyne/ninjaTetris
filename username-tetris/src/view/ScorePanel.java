/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Board;
/**
 * The Score Panel for this program.
 * 
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public class ScorePanel extends JPanel implements Observer {
    
    /**
     * Serial number for this class.
     */
    private static final long serialVersionUID = -5126780747336085145L;
    /**
     * The width of the panel.
     */
    private static final int WIDTH = 100;
    /**
     * The height of the panel.
     */
    private static final int HEIGHT = 200;
    /**
     * The background red color of the panel.
     */
    private static final int BACKGROUND_RED = 113;
    /**
     * The background green color of the panel.
     */
    private static final int BACKGROUND_GREEN = 117;
    /**
     * The background blue color of the panel.
     */
    private static final int BACKGROUND_BLUE = 77;
    /**
     * The background transparency color of the panel.
     */
    private static final int BACKGROUND_TRANSPERENCY = 65;
    /**
     * The milestones of the game, each element represents an amount of lines.
     */
    private static final int[] MY_LINES = {4, 9, 14, 19, 24, 29};
    /**
     * The first index of my lines array.
     */
    private static final int MY_0_INDEX = 0;
    /**
     * The second index of my lines array.
     */
    private static final int MY_1_INDEX = 1;
    /**
     * The third index of my lines array.
     */
    private static final int MY_2_INDEX = 2; 
    /**
     * The fourth index of my lines array.
     */
    private static final int MY_3_INDEX = 3;
    /**
     * The fifth index of my lines array.
     */
    private static final int MY_4_INDEX = 4;
    /**
     * The sixth index of my lines array.
     */
    private static final int MY_5_INDEX = 5;
    /**
     * The amount of lines cleared.
     */
    private int myLinesCleared;
    /**
     * The board object this class will be referencing.
     */
    private Board myBoard;
    
    /**
     * The game panel object this class will be refrencing.
     */
    private GamePanel myPanel;
    
    /**
     * The current level.
     */
    private int myLevel;
    
    /**
     * The lines needed till the next level.
     */
    private int myLinesTillNextLevel;
    
    /**
     * Counter used to calculate the score.
     */
    private int myCount;
    
/**
 * The constructor of this class.
 * @param theBoard the board object this class will be referencing 
 * @param thePanel the panel this class will be referencing.
 */
    public ScorePanel(final Board theBoard, final GamePanel thePanel) {
        myBoard = theBoard;
        myPanel = thePanel;
        myLinesCleared = 0;
        myLevel = 1;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(new Color(BACKGROUND_RED,
                                     BACKGROUND_GREEN, 
                                     BACKGROUND_BLUE, BACKGROUND_TRANSPERENCY));
        myBoard.addObserver(this);
    }

    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2 = (Graphics2D) theGraphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        myCount++;
        final int fontsize = 21;
        final String marker = "Marker Felt";
        g2.setFont(new Font(marker, Font.BOLD, fontsize));
        final int y0 = 18;
        g2.drawString("Lines cleared", 0, y0);
        final int x1 = 45;
        final int y1 = 38;
        g2.drawString(Integer.toString(myLinesCleared), x1, y1);
        final int x = 0;
        final int y = 60;
        g2.drawString("Level: ", x, y);
        final int x2 = 45;
        final int y2 = 60;
        g2.drawString(Integer.toString(myLevel), x2, y2);
        final int fontSize2 = 12;
        g2.setFont(new Font(marker, Font.BOLD, fontSize2));
        final int scoreY = 80;
        g2.drawString("Score" 
                        + Integer.toString(myLinesCleared * myLevel + myCount), 0, scoreY);
        final int linesY = 95;
        g2.drawString("Lines till next level:  "
                      + Integer.toString(myLinesTillNextLevel - myLinesCleared), 0, linesY);

    }

    @Override
    public void update(final Observable theO, final Object theArg) {
        repaint();

        if (theArg instanceof Object[]) {
            myLinesCleared++;
            if (myLinesCleared >= 0 && myLinesCleared <= MY_LINES[MY_0_INDEX]) {
                final int currLevel = 1;
                myLevel = currLevel;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                final int delay1 = 600;
                myPanel.setTimerDelay(delay1);

            } else if (myLinesCleared > MY_LINES[MY_0_INDEX] 
                            && myLinesCleared <= MY_LINES[MY_1_INDEX]) {
                final int currLevel2 = 2;
                myLevel = currLevel2;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                final int delay2 = 500;
                myPanel.setTimerDelay(delay2);
            } else if (myLinesCleared > MY_LINES[MY_1_INDEX] 
                            && myLinesCleared <= MY_LINES[MY_2_INDEX]) {
                final int currLevel3 = 3;
                myLevel = currLevel3;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                final int delay3 = 400;
                myPanel.setTimerDelay(delay3);
            } else if (myLinesCleared > MY_LINES[MY_2_INDEX] 
                            && myLinesCleared <= MY_LINES[MY_3_INDEX]) {
                final int currLevel4 = 4;
                myLevel = currLevel4;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                final int delay4 = 200;
                myPanel.setTimerDelay(delay4);
            } else if (myLinesCleared > MY_LINES[MY_3_INDEX] 
                            && myLinesCleared <= MY_LINES[MY_4_INDEX]) {
                final int currLevel5 = 5;
                myLevel = currLevel5;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                final int delay5 = 100;
                myPanel.setTimerDelay(delay5);
            } else if (myLinesCleared > MY_LINES[MY_4_INDEX] 
                            && myLinesCleared <= MY_LINES[MY_5_INDEX]) {
                final int currLevel6 = 6;
                myLevel = currLevel6;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                final int delay6 = 50;
                myPanel.setTimerDelay(delay6);
               
            } else if (myLinesCleared > MY_LINES[MY_5_INDEX]) {
                final int currLevel7 = 7;
                myLevel = currLevel7;
                myLinesTillNextLevel = MY_LINES[myLevel - 1];
                myPanel.setTimerDelay(0);
            }

            repaint();
        }
    }
/**
 * Resets the score board.
 */
    public void resetScoreBoard() {
        myLevel = 0;
        myLinesCleared = 0;
        myLinesTillNextLevel = 0;
        myCount = 0;
        repaint();

    }

}
