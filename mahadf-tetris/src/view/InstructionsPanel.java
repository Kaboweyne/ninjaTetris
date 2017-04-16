/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * The Instruction Panel class of this program.
 * The purpose of this class is to provide the user with instructions
 * on how to play the game.
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public class InstructionsPanel extends JPanel {
    /**
     * Serial number for this class. 
     */
    private static final long serialVersionUID = -6444029223537857103L;

    /**
     * The list of instructions on how to play the tetris game.
     */
    private static final String[] MY_INSTRUCTIONS =
    {"Instructions: ", "To move right press the RIGHT arrow key",
     "To move left press the LEFT arrow key",
     "To move down press the DOWN arrow key",
     "To rotate press the UP arrow key",
     "To drop the piece press the SPACEBAR key"};
    
    /**
     * The size of the panel.
     */
    private static final int SIZE = 300;
    
    /** The red component of the "UW Metalic" Color. */
    private static final int UWM_RED = 133;

    /** The green component of the "UW Metalic" Color. */
    private static final int UWM_GREEN = 117;

    /** The blue component of the "UW Metalic" Color. */
    private static final int UWM_BLUE = 77;
    /**
     * The color of the panel.
     */
    private Color myMetalicColor;
/**
 * The constructor for this class.
 */
    public InstructionsPanel() {
        myMetalicColor = new Color(UWM_RED, UWM_GREEN, UWM_BLUE);
        setPreferredSize(new Dimension(SIZE, SIZE));
        setBackground(myMetalicColor);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for (int i = 0; i < MY_INSTRUCTIONS.length; i++) {
            labelMaker(MY_INSTRUCTIONS[i]);
        }

    }
/**
 * A private helper method I made to help me make the Jlabels.
 * @param theLabel the text that the Label will be set to
 */
    private void labelMaker(final String theLabel) {
        final JLabel label = new JLabel();
        label.setText(theLabel);
        label.setForeground(Color.WHITE);
        final int fontSize = 14;
        label.setFont(new Font("Marker Felt", Font.BOLD, fontSize));
        add(label);

    }

}
