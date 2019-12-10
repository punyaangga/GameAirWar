import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class pahlawan extends Actor
{
    /**
     * Act - do whatever the ps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private area pl;
    public void addedToWorld(World area){
        pl=(area)area;
    }
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if(Greenfoot.mouseClicked(null)) {
            pl.addObject(new ammoPahlawan(),getX()+getImage().getHeight(),getY());
            Greenfoot.playSound("ammoPahlawan.wav");
        }
        Actor a=getOneObjectAtOffset(0,0,musuh.class);
        if(a!=null){
            getWorld().addObject(new darrSlime(),getX(),getY());
            ((area)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }    
    }
}

