/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */
package view;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The Background frame of this program.
 * 
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public class Background extends JFrame {

    /**
     * Serial number for this class.
     */
    private static final long serialVersionUID = -5332354116025895301L;

    // private NextPiece myNextPiecePanel;
    /**
     * Constructor for the class.
     */
    public Background() {
        setUp();
    }

    /**
     * Set's up the frame.
     */
    public void setUp() {
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new JLabel(new ImageIcon("./images/hokages.png")));
        setLayout(new BorderLayout());

    }
    //
    // public void setChoice(String theChoice) {
    // if ("Medium".equals(theChoice)) {
    // setContentPane(new JLabel(new ImageIcon("./images/hokages_medium.jpg")));
    // }
}
