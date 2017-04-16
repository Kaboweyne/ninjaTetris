/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
/**
 * The Menu bar class of this program.
 * 
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public class MenuBar extends JMenuBar {
    /**
     * SERIAL NUMBER FOR THIS CLASS.
     */
    private static final long serialVersionUID = -3796562460730831496L;
    /**
     * The array that will be used to pause/resume the game.
     */
    private static final boolean[] PAUSE_STATUS = {true, false};
    /**
     * How many times bigger the medium size game is compared to the default game size.
     */
    private static final int MEDIUM_MULTIPLIER = 4;
    /**
     * How much more a medium game size is bigger than a default block size.
     */
    private static final int MEDIUM_GAME_SIZE = 10;
    /**
     * How many times bigger the large size game is compared to the default game size.
     */
    private static final int LARGE_MULTIPLIER = 9;
    /**
     * How much more a large game size is bigger than a default block size.
     */
    private static final int LARGE_GAME_SIZE = 20;
    
    /**
     * Counter that will be used for calculations.
     */
    private int myCount;
    
    /**
     * The JFrame object this class will be referencing.
     */
    private JFrame myFrame;
    
    /**
     * The gamePanel object this frame will be referencing.
     */
    private GamePanel myPanel;
    
    /**
     * Whether the game is over or not.
     */
    @SuppressWarnings("unused")
    private boolean myGameOver;
    /**
     * A string to represent the small size of the game panel.
     */
    private String mySmallSize = "Small";
    /**
     * A string to represent the large size of the game panel.
     */
    private String myLargeSize = "Large";
    /**
     * A string to represent the medium size of the game panel.
     */
    private String myMediumSize = "Medium";
    /**
     * The scorePanel object this class will be referencing.
     */
    private ScorePanel myScore;
    /**
     * Constructor for the MenuBar class.
     * @param theFrame the Frame that will be received from the GamePanel.
     * @param thePanel the GamePanel itself.
     * @param theScore a reference to the scorePanel.
     */
    public MenuBar(final JFrame theFrame, final GamePanel thePanel,
                   final ScorePanel theScore) {
        myFrame = theFrame;
        myPanel = thePanel;
        myScore = theScore;

        setUp();
    }
    /**
     * Sets up the MenuBar.
     */
    public void setUp() {
        final JMenu optionsMenu = new JMenu("Options");
        final JMenu chooseSize = new JMenu("Choose Size");
        final JMenuItem newGame = new JMenuItem("New Game");
        final JMenuItem pauseGame = new JMenuItem("Pause/Resume");
        final JMenuItem endGame = new JMenuItem("End Game");
        final JMenuItem gamePlay = new JMenuItem("GamePlay");
        newGame.setEnabled(false);
        final ButtonGroup choices = new ButtonGroup();
        final JRadioButtonMenuItem smallSize = new JRadioButtonMenuItem(mySmallSize);
        final JRadioButtonMenuItem mediumSize = new JRadioButtonMenuItem(myMediumSize);
        final JRadioButtonMenuItem largeSize = new JRadioButtonMenuItem(myLargeSize);
        choices.add(smallSize);
        choices.add(mediumSize);
        choices.add(largeSize);
        smallSize.setSelected(true);
        pauseGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                if (myCount > 1) {
                    myCount = 0;
                }
                myPanel.isPaused(PAUSE_STATUS[myCount]);
                myCount++;
            }
        });
        
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myScore.resetScoreBoard();
                myPanel.startNewGame(true);
                myPanel.setGameOver(false);
                newGame.setEnabled(false);
            }
        });

        endGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                newGame.setEnabled(true);
                myGameOver = true;
                myPanel.setGameOver(true);
            }

        });

        gamePlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                JOptionPane.showMessageDialog(null,
                                              "Gameplay Instructions: \n"
                                                    + "To ROTATE press the UP arrow key\n"
                                                    + "To move DOWN press the DOWN arrow key\n"
                                                    + "To move RIGHT press the RIGHT"
                                                    + " arrow key\n"
                                                    + "To move LEFT press the LEFT arrow key\n"
                                                    + "To move DROP press the SPACEBAR key\n"
                                                    + "To PAUSE/RESUME press the P key\n"
                                                    + "Scoring:\n"
                                                    + "Scoring is determined by the amount"
                                                    + " of lines you clear\nmultiplied by the"
                                                    + " level you're on.\nThe amount of valid "
                                                    + "moves you make\nare also factored into"
                                                    + " into the scoring as well\neach "
                                                    + "valid move = 1pt");
            } });

        smallSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myPanel.setSizeChoice(mySmallSize, 1, 0);
            }
        });

        mediumSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myPanel.setSizeChoice(myMediumSize, MEDIUM_MULTIPLIER, MEDIUM_GAME_SIZE);
            }
        });

        largeSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myPanel.setSizeChoice(myLargeSize, LARGE_MULTIPLIER, LARGE_GAME_SIZE);
            }
        });

        optionsMenu.add(pauseGame);
        optionsMenu.add(newGame);
        optionsMenu.add(endGame);
        optionsMenu.add(gamePlay);

        chooseSize.add(smallSize);
        chooseSize.add(mediumSize);
        chooseSize.add(largeSize);
   

        add(optionsMenu);
        add(chooseSize);
        myFrame.add(this, BorderLayout.NORTH);

    }

}
