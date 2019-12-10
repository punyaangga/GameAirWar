import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class area extends World
{
        Nilai nilai = new Nilai("Nilai:");
    /**
     * Constructor for objects of class bg.
     * 
     */
    public area()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        setPaintOrder(skor.class, ledakan.class, pahlawan.class, musuh.class, Nilai.class, ammoPahlawan.class,darrSlime.class,ammo.class);
        addObject(new pahlawan(),9,220);
        addObject(new musuh(),790,320);
        addObject(nilai,120,450);
    }
    public void act(){
       
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new musuh(),853,Greenfoot.getRandomNumber(479));
        }
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.stop();
        }
    }
    public void tambah(){
        nilai.add(10);
    }

    /**
     * Called when game is up. Stop running and display score.
     */
    public void selesai() 
    {
        addObject(new skor(nilai.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
}
