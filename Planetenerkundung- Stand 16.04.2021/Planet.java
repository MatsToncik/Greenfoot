import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;

    /**
     * Erschaffe eine Welt mit 15 * 12 Zellen.
     */
    public Planet()
    {
        super(16, 12, zellenGroesse);
        setBackground("images/boden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20); 
        prepare();
    }

    public void gCStandard()
    {
        Huegel huegel = new Huegel();
        addObject(huegel,2,2);
        Huegel huegel2 = new Huegel();
        addObject(huegel2,2,3);
        Huegel huegel3 = new Huegel();
        addObject(huegel3,2,4);
        Huegel huegel4 = new Huegel();
        addObject(huegel4,2,5);
        Huegel huegel5 = new Huegel();
        addObject(huegel5,2,6);
        Huegel huegel6 = new Huegel();
        addObject(huegel6,2,7);
        Huegel huegel7 = new Huegel();
        addObject(huegel7,2,8);
        Huegel huegel8 = new Huegel();
        addObject(huegel8,15,8);
        Huegel huegel9 = new Huegel();
        addObject(huegel9,15,7);
        Huegel huegel10 = new Huegel();
        addObject(huegel10,15,6);
        Huegel huegel11 = new Huegel();
        addObject(huegel11,15,5);
        Huegel huegel12 = new Huegel();
        addObject(huegel12,15,4);
        Huegel huegel13 = new Huegel();
        addObject(huegel13,15,3);
        Huegel huegel14 = new Huegel();
        addObject(huegel14,15,2);
        Huegel huegel15 = new Huegel();
        addObject(huegel15,6,8);
        Huegel huegel16 = new Huegel();
        addObject(huegel16,5,4);
        Huegel huegel17 = new Huegel();
        addObject(huegel17,9,2);
        Huegel huegel18 = new Huegel();
        addObject(huegel18,13,6);
        Huegel huegel19 = new Huegel();
        addObject(huegel19,12,3);
        Huegel huegel20 = new Huegel();
        addObject(huegel20,8,5);
        Huegel huegel21 = new Huegel();
        addObject(huegel21,10,7);
        Rover rover = new Rover();
        addObject(rover,3,8);
    }
    
    public void gCA1()
    {
        
        Huegel huegel = new Huegel();
        addObject(huegel,2,1);
        Huegel huegel2 = new Huegel();
        addObject(huegel2,2,2);
        Huegel huegel3 = new Huegel();
        addObject(huegel3,2,3);
        Huegel huegel4 = new Huegel();
        addObject(huegel4,2,4);
        Huegel huegel5 = new Huegel();
        addObject(huegel5,2,5);
        Huegel huegel6 = new Huegel();
        addObject(huegel6,2,6);
        Huegel huegel7 = new Huegel();
        addObject(huegel7,2,7);
        Huegel huegel8 = new Huegel();
        addObject(huegel8,2,8);
        Huegel huegel9 = new Huegel();
        addObject(huegel9,2,9);
        Huegel huegel10 = new Huegel();
        addObject(huegel10,2,10);
        Huegel huegel11 = new Huegel();
        addObject(huegel11,9,10);
        Huegel huegel12 = new Huegel();
        addObject(huegel12,9,9);
        Huegel huegel13 = new Huegel();
        addObject(huegel13,9,8);
        Huegel huegel14 = new Huegel();
        addObject(huegel14,9,7);
        Huegel huegel15 = new Huegel();
        addObject(huegel15,9,6);
        Huegel huegel16 = new Huegel();
        addObject(huegel16,9,5);
        Huegel huegel17 = new Huegel();
        addObject(huegel17,9,4);
        Huegel huegel18 = new Huegel();
        addObject(huegel18,9,3);
        Huegel huegel19 = new Huegel();
        addObject(huegel19,9,2);
        Huegel huegel20 = new Huegel();
        addObject(huegel20,9,1);
        Huegel huegel21 = new Huegel();
        addObject(huegel21,4,1);
        Huegel huegel22 = new Huegel();
        addObject(huegel22,6,1);
        Huegel huegel23 = new Huegel();
        addObject(huegel23,5,3);
        Huegel huegel24 = new Huegel();
        addObject(huegel24,7,3);
        Huegel huegel25 = new Huegel();
        addObject(huegel25,4,5);
        Huegel huegel26 = new Huegel();
        addObject(huegel26,6,5);
        Huegel huegel27 = new Huegel();
        addObject(huegel27,7,7);
        Huegel huegel28 = new Huegel();
        addObject(huegel28,5,7);
        Huegel huegel29 = new Huegel();
        addObject(huegel29,4,9);
        Huegel huegel30 = new Huegel();
        addObject(huegel30,6,9);
        Rover rover = new Rover();
        addObject(rover,3,10);
    }
    
    public void gCA2()
    {
        
        Huegel huegel = new Huegel();
        addObject(huegel,1,3);
        Huegel huegel2 = new Huegel();
        addObject(huegel2,1,4);
        Huegel huegel3 = new Huegel();
        addObject(huegel3,1,5);
        Huegel huegel4 = new Huegel();
        addObject(huegel4,1,6);
        Huegel huegel5 = new Huegel();
        addObject(huegel5,1,7);
        Huegel huegel6 = new Huegel();
        addObject(huegel6,14,3);
        Huegel huegel7 = new Huegel();
        addObject(huegel7,14,4);
        Huegel huegel8 = new Huegel();
        addObject(huegel8,14,5);
        Huegel huegel9 = new Huegel();
        addObject(huegel9,14,6);
        Huegel huegel10 = new Huegel();
        addObject(huegel10,14,7);
        Huegel huegel11 = new Huegel();
        addObject(huegel11,4,7);
        Huegel huegel12 = new Huegel();
        addObject(huegel12,7,6);
        Huegel huegel13 = new Huegel();
        addObject(huegel13,3,5);
        Huegel huegel14 = new Huegel();
        addObject(huegel14,5,3);
        Huegel huegel15 = new Huegel();
        addObject(huegel15,9,3);
        Huegel huegel16 = new Huegel();
        addObject(huegel16,7,4);
        Huegel huegel17 = new Huegel();
        addObject(huegel17,11,5);
        Huegel huegel18 = new Huegel();
        addObject(huegel18,9,6);
        Huegel huegel19 = new Huegel();
        addObject(huegel19,11,7);
        Huegel huegel20 = new Huegel();
        addObject(huegel20,12,3);
        Rover rover = new Rover();
        addObject(rover,2,7);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
}
