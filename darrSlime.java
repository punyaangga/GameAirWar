import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class darrSlime extends Actor
{
    private final static int IMAGE_COUNT= 8;
    private static GreenfootImage[] images;
    private int size=0;
    private int increment=1;    
    
    public darrSlime() {
        initialiseImages();
        setImage(images[0]);      
        Greenfoot.playSound("fire.wav");
    }     
    
    /** 
     * Create the images for explosion.
     */
    public synchronized static void initialiseImages() {
        if(images == null) {
            GreenfootImage baseImage = new GreenfootImage("darrSlime.png");
            int maxSize = baseImage.getWidth()*5;
            int delta = maxSize / (IMAGE_COUNT+1);
            int size = 0;
            images = new GreenfootImage[IMAGE_COUNT];
            for(int i=0; i < IMAGE_COUNT; i++) {
                size = size + delta;
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    public void act() 
    {
        // Add your action code here.
        setImage(images[size]);

        size += increment;
        if(size>=IMAGE_COUNT) {
            increment = -increment;
            size += increment;
        }
        
        if(size <= 0) {
            getWorld().removeObject(this);
        }
    }    
}
