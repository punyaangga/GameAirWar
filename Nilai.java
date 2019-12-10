import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game dibuat oleh :
 * 
 * @author (Angga Fantiya Hermawan) 
 * follow istagram (punya_angga)
 *@email (anggafantiya@gmail.com)
 */
public class Nilai extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;

    public Nilai()
    {
        this("");
    }

    public Nilai(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        
        updateImage();
    }
    
    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }

    public void add(int score)
    {
        target += score;
    }

    public void subtract(int score)
    {
        target -= score;
    }

    public int getValue()
    {
        return value;
    }

    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
