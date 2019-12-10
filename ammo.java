import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class ammo extends Actor
{
    /**
     * Act - do whatever the pelor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-32,y);
        if(x==0){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneIntersectingObject(pahlawan.class);
        if(a != null){
            getWorld().addObject(new darrSlime(),getX(),getY());
            ((area)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
    
}
