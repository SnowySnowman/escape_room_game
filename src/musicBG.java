/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.slchichlacht;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author LUNA
 */
public class musicBG {

/**
 *
 * @author LUNA
 */
    
    Clip clip;
    
    public musicBG(){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("src/sounds/Background.wav"));
            
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch(Exception e){e.printStackTrace();}
    }

    }
