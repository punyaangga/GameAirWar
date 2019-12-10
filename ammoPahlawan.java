import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class ammoPahlawan extends Actor
{
    /**
     * Act - do whatever the pelor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x+29,y);
        if(x == 853){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneObjectAtOffset(0 ,0, musuh.class);
        if(a != null){
            getWorld().addObject(new ledakan(),getX(),getY());
            ((area)getWorld()).tambah();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
}

