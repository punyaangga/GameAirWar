import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class pembuat extends World
{
    private boolean song=true;
    private GreenfootSound songGame;
    
    /**
     * Constructor for objects of class awal.
     * 
     */
    public pembuat()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1);
    
         songGame = new GreenfootSound("soundcredit.mp3");
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
    public void menu()
    {
    addObject(new kembali(),100,400);
    }
}

