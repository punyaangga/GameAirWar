import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class awal extends World
{
    private boolean song=true;
    private GreenfootSound songGame;
    
    /**
     * Constructor for objects of class awal.
     * 
     */
    public awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1);
    
         songGame = new GreenfootSound("backsound.mp3");
        menu();
    }
    public void act(){

        if(song)
            songGame.play();
    }
    public void started()
    {
        super.started();
        songGame.setVolume(100);
        songGame.playLoop();
    }

    public void stopped()
    {
        super.stopped();
        songGame.pause();
        song=false; 
    }
    private void menu()
    {
            addObject(new credit(),600,250);
            addObject(new start(),220,250);
            addObject(new Logo(),100,60);
       

    }
}

