/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import model.MovableTetrisPiece;
/**
 * The Next Piece class of this program
 * The purpose of this class is to display the next tetris piece.
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public class NextPiece extends JLabel {
    /**
     * Serial number for this class.
     */
    private static final long serialVersionUID = -1607931918798720409L;

    /**
     * The size of the blocks that will be displaying on the panel.
     */
    private static final int BLOCK_SIZE = 20;
    
    /**
     * The height of the panel.
     */
    private static final int HEIGHT = 100;
    
    /**
     * The width of the panel.
     */
    private static final int WIDTH = 100;
    
    
    /**
     * The tetris piece I will be receiving from the board.
     */
    private MovableTetrisPiece myPiece;
    /**
     * The UW Purple Color.
     */
    private Color myColor;
    /**
     * The UW Metalic Gold Color.
     */
    private Color myMetalicColor;

   /**
    * The constructor for the next piece panel.
    */
    public NextPiece() {
        setPreferredSize(new Dimension(HEIGHT, WIDTH));
        myColor = Color.ORANGE; //new Color(UW_RED, UW_GREEN, UW_BLUE);
        myMetalicColor = Color.BLACK; //new Color(UWM_RED, UWM_GREEN, UWM_BLUE);
        //setBackground(new Color(UWG_RED, UWG_GREEN, UWG_BLUE, 90));
        setBackground(Color.RED);
        //this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));  
        //repaint();
       
       
    }
   /**
    * Helper method that draws the O piece blocks.
    * @param theGraphics the graphics object
    * @return returns a rectangle2D object
    */
    public Graphics2D drawOPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int oXCoordinate = 30;
        final int oYCoordinate = 25;
        theGraphics.fillRect(oXCoordinate, oYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(oXCoordinate + BLOCK_SIZE, oYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(oXCoordinate, oYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(oXCoordinate + BLOCK_SIZE,
                             oYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(oXCoordinate, oYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(oXCoordinate + BLOCK_SIZE, oYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(oXCoordinate, oYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(oXCoordinate + BLOCK_SIZE,
                             oYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;

    }

    /**
     * Helper method that draws the S piece blocks.
     * 
     * @param theGraphics the graphics object
     * @return returns a rectangle2D object
     */
    public Graphics2D drawSPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int sXCoordinate = 40;
        final int sYCoordinate = 20;
        theGraphics.fillRect(sXCoordinate, sYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(sXCoordinate + BLOCK_SIZE, sYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(sXCoordinate,
                             sYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(sXCoordinate - BLOCK_SIZE,
                             sYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(sXCoordinate, sYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(sXCoordinate + BLOCK_SIZE, sYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(sXCoordinate, sYCoordinate + BLOCK_SIZE,
                             BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(sXCoordinate - BLOCK_SIZE, 
                             sYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;
    }

    /**
     * Helper method that draws the Z piece blocks.
     * 
     * @param theGraphics the graphics object
     * @return returns a rectangle2D object
     */
    public Graphics2D drawZPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int zXCoordinate = 20;
        final int zYCoordinate = 20;
        theGraphics.fillRect(zXCoordinate, zYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(zXCoordinate + BLOCK_SIZE, zYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(zXCoordinate + BLOCK_SIZE,
                             zYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(zXCoordinate + BLOCK_SIZE * 2, 
                             zYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(zXCoordinate, zYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(zXCoordinate + BLOCK_SIZE, zYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(zXCoordinate + BLOCK_SIZE,
                             zYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(zXCoordinate + BLOCK_SIZE * 2,
                             zYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;

    }

    /**
     * Helper method that draws the I piece blocks.
     * 
     * @param theGraphics the graphics object
     * @return returns a rectangle2D object
     */
    public Graphics2D drawIPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int iXCoordinate = 10;
        final int iYCoordinate = 40;
        final int spaces = 3;
        theGraphics.fillRect(iXCoordinate, iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(iXCoordinate + BLOCK_SIZE, iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(iXCoordinate + BLOCK_SIZE * 2,
                             iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(iXCoordinate + BLOCK_SIZE * spaces,
                             iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(iXCoordinate, iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(iXCoordinate + BLOCK_SIZE, iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(iXCoordinate + BLOCK_SIZE * 2,
                             iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(iXCoordinate + BLOCK_SIZE * spaces,
                             iYCoordinate, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;

    }

    /**
     * Helper method that draws the J piece blocks.
     * 
     * @param theGraphics the graphics object
     * @return returns a rectangle2D object
     */
    public Graphics2D drawJPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int jXCoordinate = 20;
        final int jYCoordinate = 20;
        theGraphics.fillRect(jXCoordinate, jYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(jXCoordinate, jYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(jXCoordinate + BLOCK_SIZE,
                             jYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(jXCoordinate + BLOCK_SIZE * 2,
                             jYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(jXCoordinate, jYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(jXCoordinate, jYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(jXCoordinate + BLOCK_SIZE,
                             jYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(jXCoordinate + BLOCK_SIZE * 2,
                             jYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;

    }

    /**
     * Helper method that draws the L piece blocks.
     * 
     * @param theGraphics the graphics object
     * @return returns a rectangle2D object
     */
    public Graphics2D drawLPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int lXCoordinate = 60;
        final int lYCoordinate = 20;
        
        theGraphics.fillRect(lXCoordinate, lYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(lXCoordinate, lYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(lXCoordinate - BLOCK_SIZE,
                             lYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(lXCoordinate - BLOCK_SIZE * 2,
                             lYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(lXCoordinate, lYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(lXCoordinate, lYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(lXCoordinate - BLOCK_SIZE,
                             lYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(lXCoordinate - BLOCK_SIZE * 2,
                             lYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;

    }

    /**
     * Helper method that draws the T piece blocks.
     * 
     * @param theGraphics the graphics object
     * @return returns a rectangle2D object
     */
    public Graphics2D drawTPiece(final Graphics2D theGraphics) {
        theGraphics.setPaint(myColor);
        final int tXCoordinate = 40;
        final int tYCoordinate = 20;
        theGraphics.fillRect(tXCoordinate, tYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(tXCoordinate, tYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(tXCoordinate - BLOCK_SIZE,
                             tYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.fillRect(tXCoordinate + BLOCK_SIZE,
                             tYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.setPaint(myMetalicColor);
        theGraphics.drawRect(tXCoordinate, tYCoordinate, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(tXCoordinate, tYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(tXCoordinate - BLOCK_SIZE,
                             tYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        theGraphics.drawRect(tXCoordinate + BLOCK_SIZE,
                             tYCoordinate + BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        return theGraphics;

    }
    
    
   
    
    
    
    
    
    
    
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2 = (Graphics2D) theGraphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        if (myPiece != null) {
            
            if ("O".equals(myPiece.getBlock().name())) {
                drawOPiece(g2);
            } else if ("S".equals(myPiece.getBlock().name())) {
                drawSPiece(g2);
            } else if ("Z".equals(myPiece.getBlock().name())) {
                drawZPiece(g2);
            }  else if ("J".equals(myPiece.getBlock().name())) {
                drawJPiece(g2);
            } else if ("L".equals(myPiece.getBlock().name())) {
                drawLPiece(g2);
            }  else if ("I".equals(myPiece.getBlock().name())) {
                drawIPiece(g2);
            } else if ("T".equals(myPiece.getBlock().name())) {
                drawTPiece(g2);
            }
            
        
        }
    }







    /**
     * Sets myPiece Tetris piece to the piece that's received.
     * @param thePiece the MovableTetrisPiece Object
     */
    public void setNextPiece(final Object thePiece) {
        
        myPiece = (MovableTetrisPiece) thePiece;
        repaint();
        
    }
    
   
    

}
