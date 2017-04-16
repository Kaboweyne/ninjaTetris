/*
 * TCSS 305 - Autumn 2016 Assignment 6b - Tetris
 */
package view;

import com.sun.media.codec.audio.mp3.JavaDecoder;
import java.awt.EventQueue;

//import com.sun.xml.internal.ws.api.pipe.Codec;

import javax.media.Codec;
import javax.media.PlugInManager;


/**
 * The main class of this program.
 * The purpose of this class is to kick start the GUI.
 * @author Mahad Fahiye
 * @version 12.11.2016.1
 */
public final class GUI {
    /**
     * The private constructor of this class.
     * Since this is a utility class, I don't want it to be instantiated.
     */
    private GUI() { }
    /**
     * Main method for this program.
     * @param theArgs the arguments passed in if its ran at the command line.
     * 
     * 
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                final Codec c = new JavaDecoder();
                PlugInManager.addPlugIn("com.sun.media.codec.audio.mp3.JavaDecoder",
                                        c.getSupportedInputFormats(),
                                        c.getSupportedOutputFormats(null),
                                        PlugInManager.CODEC);
                final GamePanel gamePanel = new GamePanel();
                gamePanel.setUp();

            }

        });
    }

}
