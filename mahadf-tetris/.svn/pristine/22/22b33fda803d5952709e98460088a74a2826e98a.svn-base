/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import model.Board;
import model.MovableTetrisPiece;

/**
 * The Tetris Game Panel for this program.
 * 
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public class GamePanel extends JLabel implements Observer {
    /**
     * Serial number for this class.
     */
    private static final long serialVersionUID = -1172487208830731928L;
    /**
     * The array that will be used to pause and resume the game.
     */
    private static final boolean[] PAUSE_STATUS = {true, false};
    /**
     * The file location of the small leaves gif.
     */
    private static final String MY_SMALL_LEAVES = "./images/leaves.gif";
    /**
     * The file location of the medium leaves gif.
     */
    private static final String MY_MEDIUM_LEAVES = "./images/leaves_medium.gif";
    /**
     * The file location of the large leaves gif.
     */
    private static final String MY_LARGE_LEAVES = "./images/large_leaves.gif";
    /**
     * Number of loops.
     */
    private static final int LOOPS = 42;
    
    /**
     * The sound files that will be used in this program.
     */
    private static final File[] SOUND_FILES = new File[LOOPS];

    /** The red component of the block Color. */
    private static final int BLOCK_RED = 255;

    /** The green component of the block Color. */
    private static final int BLOCK_GREEN = 165;

    /** The blue component of the block Color. */
    private static final int BLOCK_BLUE = 0;

    /** The transparency of the block Color. */
    private static final int BLOCK_TRANSPERENCY = 111;

    /** The red component of the "UW purple" Color. */
    private static final int UW_RED = 75;

    /** The green component of the "UW purple" Color. */
    private static final int UW_GREEN = 46;

    /** The blue component of the "UW purple" Color. */
    private static final int UW_BLUE = 131;

    /** The red component of the "UW Gold" Color. */
    private static final int UWG_RED = 183;

    /** The green component of the "UW Gold" Color. */
    private static final int UWG_GREEN = 165;

    /** The blue component of the "UW Gold" Color. */
    private static final int UWG_BLUE = 122;

    /**
     * The timer delay.
     */
    private static final int DELAY = 1000;

    /**
     * The height of the game panel.
     */
    private static final int HEIGHT = 100;

    /**
     * The width of the game panel.
     */
    private static final int WIDTH = 200;

    /**
     * The width of the frame.
     */
    private static final int FRAME_WIDTH = 400;

    /**
     * The height of the frame.
     */
    private static final int FRAME_HEIGHT = 245;

    /**
     * The size of each Tetris block.
     */
    private static final int BLOCK_SIZE = 10;
    /**
     * The Frame that will hold all the components.
     */
    private Background myFrame;
    /**
     * The Board Object that I will be using to in this class.
     */
    private Board myBoard;

    /**
     * The color of the Tetris shapes.
     */
    @SuppressWarnings("unused")
    private Color myColor;

    /**
     * The timer that I will use to make the Tetris pieces drop.
     */
    private Timer myTimer;
    /**
     * The x counter to keep track of the x coordinate of the Tetris piece.
     */
    private int myXCount;

    /**
     * The y counter to keep track of the y coordinate of the Tetris piece.
     */
    private int myYCount;

    /**
     * The Next piece panel object that will be used for reference.
     */
    private NextPiece myNextPiecePanel;

    /**
     * UW GOLD color that will be used for the background color of the panel.
     */
    @SuppressWarnings("unused")
    private Color myGoldColor;

    /**
     * Boolean for storing whether the game is over or not.
     */
    private boolean myGameOver;
    /**
     * returns whether the game is paused or not.
     */
    private boolean myGamePaused;
    
    /**
     * returns whether a new game has been started or not.
     */
    private boolean myNewGame;
    
    /**
     * The difference of size.
     */
    private int myMultiplier;
    
    /**
     * The game board size.
     */
    private int myGameSize;
    
    /**
     * The piece movement keyListener.
     */
    private DirectionListener myDirectionListener;
    
    
    /**
     * The score Panel.
     */
    private ScorePanel myScore;
    
    /**
     * A string representation of the board's size.
     */
    private String myPanelSize;

    /**
     * Pause/Resume KeyListener.
     */
    private PauseListener myPauseListener;
    
    /**
     * The color of the Tetris Block.
     */
    @SuppressWarnings("unused")
    private Color myBlockColor;
    
    /**
     * The transparent color that will be displayed when the game is over.
     */
    private Color myTransperentColor;
    
    /**
     * The music player object that will be playing music.
     */
    private MusicPlayer myPlayer;
    
    /**
     * The sound player object that will be in charge of the sound effects.
     */
    private SoundPlayer mySoundPlayer;
    /**
     * A string to represent the large size of the panel. 
     */
    private String myLargeSize;
    /**
     * A string to represent the medium size of the panel. 
     */
    private String myMediumSize;
    /**
     * A string to represent the small size of the panel. 
     */
    private String mySmallSize;
    

    /**
     * The constructor for the Game panel.
     */
    public GamePanel() {
        
        myTransperentColor = new Color(BLOCK_RED, BLOCK_GREEN, BLOCK_BLUE, BLOCK_TRANSPERENCY);
        myBlockColor = new Color(BLOCK_RED, BLOCK_GREEN, BLOCK_BLUE);
        myBoard = new Board();
        myTimer = new Timer(DELAY, new TimerListener());

        myColor = new Color(UW_RED, UW_GREEN, UW_BLUE);
        myGoldColor = new Color(UWG_RED, UWG_GREEN, UWG_BLUE);
        myMultiplier = 1;
        myDirectionListener = new DirectionListener();
        
        setPreferredSize(new Dimension(HEIGHT, WIDTH));

        // setBackground(myGoldColor);
        // setVisible(true);

    }

    /**
     * Sets up the game panel.
     */
    public void setUp() {
        myPauseListener = new PauseListener();
        mySoundPlayer = new SoundPlayer();
        myFrame = new Background();
        myFrame.setFocusable(true);
        myFrame.addKeyListener(myDirectionListener);
        myFrame.addKeyListener(myPauseListener);
        myTimer.start();
        myBoard.addObserver(this);
       
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel eastPanel = new JPanel();
        myNextPiecePanel = new NextPiece();
        final JPanel nextPieceWindow = new JPanel();
        new InstructionsPanel();
        nextPieceWindow.setLayout(new GridLayout(2, 1));
        nextPieceWindow.add(myNextPiecePanel);
        myScore = new ScorePanel(myBoard, this);
        nextPieceWindow.add(myScore);

        final MenuBar menuBar = new MenuBar(myFrame, this, myScore);
        myFrame.add(menuBar, BorderLayout.NORTH);

        final Icon icon2 = new ImageIcon(MY_SMALL_LEAVES);

        final JLabel nextPieceLabel = new JLabel();
        this.setIcon(icon2);
        final int opacity = 100;

        nextPieceWindow.setBackground(new Color(UWG_RED, UWG_GREEN, UWG_BLUE, opacity));
        nextPieceLabel.setText("Next Piece ");
        final int fontsize = 30;
        nextPieceLabel.setFont(new Font("Marker Felt", Font.BOLD, fontsize));

        eastPanel.setLayout(new BorderLayout());
        eastPanel.add(nextPieceWindow, BorderLayout.EAST);
        final int eastHeight = 300;
        final int eastWidth = 200;

        
        eastPanel.setPreferredSize(new Dimension(eastHeight, eastWidth));
        eastPanel.setBackground(new Color(0, 0, 0, opacity));
        myPlayer = new MusicPlayer();
        for (int i = 0; i < SOUND_FILES.length; i++) {
            SOUND_FILES[i] = new File("sounds/naruto.wav");
        }
        myPlayer.newList(SOUND_FILES);
        myPlayer.play();

        myBoard.newGame();
        myFrame.add(this, BorderLayout.WEST);
        myFrame.add(eastPanel, BorderLayout.EAST);
        myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        myFrame.setLocationRelativeTo(null);
        myLargeSize = "Large";
        myMediumSize = "Medium";
        mySmallSize = "Small";
        myFrame.setVisible(true);
        myFrame.setIconImage(new ImageIcon("./images/naruto_icon.png").getImage());
        myFrame.setResizable(false);

    }
    /**
     * Sets whether the game is paused or not.
     * @param theCondition true or false depending on the game's state.
     */
    public void isPaused(final boolean theCondition) {

        myGamePaused = theCondition;

    }
    /**
     * Starts a new game.
     * @param theCondition true or false.
     */
    public void startNewGame(final boolean theCondition) {
        myNewGame = theCondition;
    }

    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2 = (Graphics2D) theGraphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        // this.setBackground(new Color(0,0,0,30));
        // g2.drawImage(myBackground, 0, 0, null);
        final String line = myBoard.toString();
        // the 4 lines before a piece enters the game board.
        final int ignoredCharecters = 65;
        myXCount = 0;
        myYCount = 0;
        for (int i = ignoredCharecters; i < line.length() - 1; i++) {
            if (line.charAt(i) == '\n') {
                myYCount++;
                myXCount = 0;

            }

            if (line.charAt(i) == ' ') {
                myXCount++;
            } else if (Character.isAlphabetic(line.charAt(i))) {
                if (myGameOver) {
                    g2.setPaint(myTransperentColor);
                } else {
                    g2.setPaint(Color.ORANGE);
                }

                g2.fillRect(myXCount * (HEIGHT * myMultiplier / (BLOCK_SIZE + myGameSize)),
                            myYCount * (WIDTH * myMultiplier / (BLOCK_SIZE + myGameSize)) / 2,
                            BLOCK_SIZE + myGameSize, BLOCK_SIZE + myGameSize);
                g2.setPaint(Color.BLACK);
                g2.drawRect(myXCount * (HEIGHT * myMultiplier / (BLOCK_SIZE + myGameSize)),
                            myYCount * (WIDTH * myMultiplier / (BLOCK_SIZE + myGameSize)) / 2,
                            BLOCK_SIZE + myGameSize, BLOCK_SIZE + myGameSize);

                myXCount++;

            }
        }
        if (myGameOver) {
            repaint();
            
            if (myLargeSize.equals(myPanelSize)) {
                this.setIcon(new ImageIcon("./images/gameover_large.gif"));
                // repaint();
            } else if (myMediumSize.equals(myPanelSize)) {
                // this.setPreferredSize(new Dimension(10,500));
                this.setIcon(new ImageIcon("./images/gameover_medium.gif"));
                // this.setPreferredSize(new Dimension(1000,500));
            } else {
                this.setIcon(new ImageIcon("./images/game_over.gif"));
            }
            myFrame.setTitle("Game Over");
        } else {
            if (myLargeSize.equals(myPanelSize)) {
                this.setIcon(new ImageIcon(MY_LARGE_LEAVES));
                // repaint();
            } else if (myMediumSize.equals(myPanelSize)) {
                // this.setPreferredSize(new Dimension(10,500));
                this.setIcon(new ImageIcon(MY_MEDIUM_LEAVES));
                // this.setPreferredSize(new Dimension(1000,500));
            } else {
                this.setIcon(new ImageIcon(MY_SMALL_LEAVES));
            }
            myFrame.setTitle("Tetris");
        }

    }

    @Override
    public void update(final Observable theO, final Object theArg) {
        if (theArg instanceof MovableTetrisPiece) {
            // System.out.println(theArg.toString());
            myNextPiecePanel.setNextPiece(theArg);

        } else if (theArg.equals(true)) {
            myGameOver = true;

        } else if (theArg instanceof Object[]) {
            mySoundPlayer.play("./sounds/NarutoLineCleared.wav");
        }

        repaint();

    }

    /**
     * Sets the size of the game panel.
     * @param theSize represented as a String
     * @param theMultiplier How many times greater it is than the default size
     * @param theGameSize the new game size
     */
    public void setSizeChoice(final String theSize, final int theMultiplier,
                              final int theGameSize) {
        myMultiplier = theMultiplier;
        myGameSize = theGameSize;
        myPanelSize = theSize;
        if (myMediumSize.equals(theSize)) {
            setPreferredSize(new Dimension(HEIGHT * (myMultiplier / 2),
                                           WIDTH * (myMultiplier / 2)));
            final int mediumHeight = 501;
            final int mediumWidth = 445;
            myFrame.setSize(mediumHeight, mediumWidth);
            /** A ToolKit. */
            final Toolkit kit = Toolkit.getDefaultToolkit();

            myFrame.setLocation((int) (kit.getScreenSize().getWidth() / 2
                                        - myFrame.getWidth() / 2),
                                 (int) (kit.getScreenSize().getHeight() / 2
                                        - myFrame.getHeight() / 2));
            this.setIcon(new ImageIcon(MY_MEDIUM_LEAVES));

        } else if (myLargeSize.equals(theSize)) {
            final int largeSize = 3;
            setPreferredSize(new Dimension(HEIGHT * (myMultiplier / largeSize),
                                           WIDTH * (myMultiplier / largeSize)));
            final int largeHeight = 601;
            final int largeWidth = 645;
            myFrame.setSize(largeHeight, largeWidth);
            /** A ToolKit. */
            final Toolkit kit = Toolkit.getDefaultToolkit();

            myFrame.setLocation((int) (kit.getScreenSize().getWidth() / 2
                                        - myFrame.getWidth() / 2),
                                 (int) (kit.getScreenSize().getHeight() / 2
                                        - myFrame.getHeight() / 2));
            this.setIcon(new ImageIcon(MY_LARGE_LEAVES));

        } else if (mySmallSize.equals(theSize)) {
            
            myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
            this.setIcon(new ImageIcon(MY_SMALL_LEAVES));
            /** A ToolKit. */
            final Toolkit kit = Toolkit.getDefaultToolkit();

            myFrame.setLocation((int) (kit.getScreenSize().getWidth() / 2
                                        - myFrame.getWidth() / 2),
                                 (int) (kit.getScreenSize().getHeight() / 2
                                        - myFrame.getHeight() / 2));

        }

    }
/**
 * Ends/Starts the game.
 * @param theGame true or false whether to start or end a game.
 */
    public void setGameOver(final boolean theGame) {
        myGameOver = theGame;
        // System.out.println(myGameOver);
        if (myGameOver) {

            myTimer.stop();
            myFrame.removeKeyListener(myDirectionListener);
            myFrame.removeKeyListener(myPauseListener);
        } else {
            myFrame.addKeyListener(myDirectionListener);
            myFrame.addKeyListener(myPauseListener);
            myTimer.start();
        }

    }
    /**
     * Returns whether the game is over or not.
     * @return true or false depending whether the game is over or not.
     */
    public boolean isGameOver() {
        return myGameOver;
    }

    /**
     * Changes the timer delay.
     * @param theTime the new delay
     */
    public void setTimerDelay(final int theTime) {
        myTimer.setDelay(theTime);
        // TODO Auto-generated method stub

    }

    /**
     * The Keyboard Listener for this program.
     * 
     * @author Mahad Fahiye
     * @version 12.11.2016.1
     */
    private class DirectionListener implements KeyListener {
        /**
         * The sound made when a piece is rotate/dropped.
         */
        private String myRotateDrop = "./sounds/Naruto_move3.wav";
        @Override
        public void keyTyped(final KeyEvent theE) {
            if (theE.getKeyCode() == KeyEvent.VK_RIGHT) {
                myBoard.right();

            }

        }

        @Override
        public void keyPressed(final KeyEvent theE) {
            if (theE.getKeyCode() == KeyEvent.VK_RIGHT) {
                myBoard.right();

                // soundPlayer.preLoad("./sounds/Naruto_move1.wav");
                mySoundPlayer.play("./sounds/Naruto_move1.wav");
            }
            if (theE.getKeyCode() == KeyEvent.VK_LEFT) {
                myBoard.left();
                mySoundPlayer.play("./sounds/Naruto_move2.wav");

            }
            if (theE.getKeyCode() == KeyEvent.VK_DOWN) {
                myBoard.down();
            }
            if (theE.getKeyCode() == KeyEvent.VK_SPACE) {
                myBoard.drop();
                mySoundPlayer.play(myRotateDrop);
            }
            if (theE.getKeyCode() == KeyEvent.VK_UP) {
                myBoard.rotate();
                mySoundPlayer.play(myRotateDrop);
            }

        }

        @Override
        public void keyReleased(final KeyEvent theE) {
            // TODO Auto-generated method stub

        }

    }
    /**
     * The Pause/Resume Keyboard Listener for this program.
     * 
     * @author Mahad Fahiye
     * @version 12.11.2016.1
     */
    private class PauseListener implements KeyListener {
        /**
         * the counter.
         */
        private int myCount;

        @Override
        public void keyTyped(final KeyEvent theE) {

        }

        @Override
        public void keyPressed(final KeyEvent theE) {
            if (theE.getKeyCode() == KeyEvent.VK_P) {

                if (myCount > 1) {
                    myCount = 0;

                }

                myGamePaused = PAUSE_STATUS[myCount];
                if (!myGamePaused) {
                    myFrame.addKeyListener(myDirectionListener);
                } else {
                    myFrame.removeKeyListener(myDirectionListener);
                }
                myCount++;
            }
        }

        @Override
        public void keyReleased(final KeyEvent theE) {
            // TODO Auto-generated method stub

        }

    }

    /**
     * The Timer Action Listener for this program.
     * 
     * @author Mahad Fahiye
     * @version 12.11.2016.1
     */
    private class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(final ActionEvent theE) {

            if (!myGamePaused) {
                myBoard.down();
            }
            if (myNewGame) {
                myBoard.newGame();
                myNewGame = false;
            }

        }

    }

}
