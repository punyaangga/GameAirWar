import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class musuh extends Actor
{
    /**
     * Act - do whatever the ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-2,y);
        if(x==0){
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            if(mouse.getY()>(y-7) && mouse.getY()<(y+7)){
                getWorld().addObject(new ammo(),getX(),getY());
                Greenfoot.playSound("ammo.wav");
            }
        }
    }    
}

