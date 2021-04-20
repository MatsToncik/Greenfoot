import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rover extends Actor
{
   private Display anzeige;

   public void act() 
    {
     
    } 
   
   public void gruppeC(int posXObenLinks, int posYObenLinks, int posXUntenRechts, int posYUntenRechts, String startEcke, String zielEcke)
   {
       if(zielEcke=="obenLinks")
       {
           if(startEcke=="untenLinks" || startEcke=="untenRechts" || startEcke=="obenLinks" || startEcke=="obenRechts")
           {
               while(getX()!=posXObenLinks || getY()!=posYObenLinks)
               {
                   fahre();
                   if(getX()==posXObenLinks && getY()==posYObenLinks)
                   {
                       break;
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()==posXUntenRechts)
                   {
                       drehe("links");
                       fahre();
                       drehe("links");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()==posXObenLinks)
                   {
                       drehe("rechts");
                       fahre();
                       drehe("rechts");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getY()==posYObenLinks)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()!=posXUntenRechts)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()!=posXObenLinks)
                   {
                       hVUODL();
                   }
               }
           }
           if(getX()==posXObenLinks && getY()==posYObenLinks)
           {
               setzeMarke();
           }
       }
       if(zielEcke=="obenRechts")
       {
           if(startEcke=="untenLinks" || startEcke=="untenRechts" || startEcke=="obenLinks" || startEcke=="obenRechts")
           {
               while(getX()!=posXUntenRechts || getY()!=posYObenLinks)
               {
                   fahre();
                   if(getX()==posXUntenRechts && getY()==posYObenLinks)
                   {
                       break;
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()==posXUntenRechts)
                   {
                       drehe("links");
                       fahre();
                       drehe("links");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()==posXObenLinks)
                   {
                       drehe("rechts");
                       fahre();
                       drehe("rechts");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getY()==posYObenLinks)
                   {
                       hVUODL();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()!=posXUntenRechts)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()!=posXObenLinks)
                   {
                       hVUODL();
                   }
               }
           }
           if(getX()==posXUntenRechts && getY()==posYObenLinks)
           {
               setzeMarke();
           }
       }
       if(zielEcke=="untenLinks")
       {
           if(startEcke=="obenLinks" || startEcke=="obenRechts")
           {
               while(getX()!=posXObenLinks || getY()!=posYUntenRechts)
               {
                   fahre();
                   if(getX()==posXObenLinks && getY()==posYUntenRechts)
                   {
                       break;
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()==posXUntenRechts)
                   {
                       drehe("rechts");
                       fahre();
                       drehe("rechts");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()==posXObenLinks)
                   {
                       drehe("links");
                       fahre();
                       drehe("links");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getY()==posYObenLinks)
                   {
                       hVUODL();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getY()==posYObenLinks)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()!=posXUntenRechts)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()!=posXObenLinks)
                   {
                       hVUODL();
                   }
               }
           }
           if(startEcke=="untenLinks" || startEcke=="untenRechts")
           {
               while(getX()!=posXObenLinks || getY()!=posYUntenRechts)
               {
                   fahre();
                   if(getX()==posXObenLinks && getY()==posYUntenRechts)
                   {
                       break;
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()==posXUntenRechts)
                   {
                       drehe("rechts");
                       fahre();
                       drehe("rechts");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()==posXObenLinks)
                   {
                       drehe("links");
                       fahre();
                       drehe("links");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getY()==posYObenLinks)
                   {
                       hVUODL();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getY()==posYObenLinks)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()!=posXUntenRechts)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()!=posXObenLinks)
                   {
                       hVUODL();
                   }
               }
           }
           if(getX()==posXObenLinks && getY()==posYUntenRechts)
           {
               setzeMarke();
           }
       }
       if(zielEcke=="untenRechts")
       {
           if(startEcke=="obenLinks" || startEcke=="obenRechts")
           {
               while(getX()!=posXUntenRechts || getY()!=posYUntenRechts)
               {
                   fahre();
                   if(getX()==posXUntenRechts && getY()==posYUntenRechts)
                   {
                       break;
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()==posXUntenRechts)
                   {
                       drehe("rechts");
                       fahre();
                       drehe("rechts");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()==posXObenLinks)
                   {
                       drehe("links");
                       fahre();
                       drehe("links");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getY()==posYObenLinks)
                   {
                       hVUODL();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()!=posXUntenRechts)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()!=posXObenLinks)
                   {
                       hVUODR();
                   }
               }
               if(getX()==posXUntenRechts && getY()==posYUntenRechts)
               {
                   setzeMarke();
               }
           }
           if(startEcke=="untenLinks" || startEcke=="untenRechts")
           {
               while(getX()!=posXUntenRechts || getY()!=posYUntenRechts)
               {
                   fahre();
                   if(getX()==posXUntenRechts && getY()==posYUntenRechts)
                   {
                       break;
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()==posXUntenRechts)
                   {
                       drehe("links");
                       fahre();
                       drehe("links");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()==posXObenLinks)
                   {
                       drehe("rechts");
                       fahre();
                       drehe("rechts");
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getY()==posYObenLinks)
                   {
                       hVUODL();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==0 && getX()!=posXUntenRechts)
                   {
                       hVUODR();
                   }
                   if(huegelVorhanden("vorne") && getRotation()==180 && getX()!=posXObenLinks)
                   {
                       hVUODL();
                   }
               }
               if(getX()==posXUntenRechts && getY()==posYUntenRechts)
               {
                   setzeMarke();
               }
           }
       }
   } 

   public void hVUODR()
   {
       drehe("links");
       fahre();
       drehe("rechts");
       fahre();
       fahre();
       drehe("rechts");
       fahre();
       drehe("links");       
   }
   
   public void hVUODL()
   {
       drehe("rechts");
       fahre();
       drehe("links");
       fahre();
       fahre();
       drehe("links");
       fahre();
       drehe("rechts");       
   }
   
   /**
     * Der Rover bewegt sich ein Feld in Fahrtrichtung weiter.
     * Sollte sich in Fahrtrichtung ein Objekt der Klasse Huegel befinden oder er sich an der Grenze der Welt befinden,
     * dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void fahre()
    {
        int posX = getX();
        int posY = getY();

        if(huegelVorhanden("vorne"))
        {
            nachricht("Zu steil!");
        }
        else if(getRotation()==270 && getY()==1)
        {
            nachricht("Ich kann mich nicht bewegen");
        }
        else
        {
            move(1);
            Greenfoot.delay(1);
        }

        if(posX==getX()&&posY==getY()&&!huegelVorhanden("vorne"))
        {
            nachricht("Ich kann mich nicht bewegen");
        }
    }

   /**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung („links“ oder „rechts“) übergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
        }
        else
        {
            nachricht("Befehl nicht korrekt!");
        }
    }

    /**
     * Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Klasse Gestein befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean gesteinVorhanden()
    {
        if(getOneIntersectingObject(Gestein.class)!=null)
        {
            nachricht("Gestein gefunden!");
            return true;

        }
        return false;
    }

    /**
     * Der Rover überprüft, ob sich in richtung ("rechts", "links", oder "vorne") ein Objekt der Klasse Huegel befindet.
     * Das Ergebnis wird auf dem Display angezeigt.
     * Sollte ein anderer Text (String) als "rechts", "links" oder "vorne" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public boolean huegelVorhanden(String richtung)
    {
        int rot = getRotation();

        if (richtung=="vorne" && rot==0 || richtung=="rechts" && rot==270 || richtung=="links" && rot==90)
        {
            if(getOneObjectAtOffset(1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==180 || richtung=="rechts" && rot==90 || richtung=="links" && rot==270)
        {
            if(getOneObjectAtOffset(-1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(-1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==90 || richtung=="rechts" && rot==0 || richtung=="links" && rot==180)
        {
            if(getOneObjectAtOffset(0,1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if (richtung=="vorne" && rot==270 || richtung=="rechts" && rot==180 || richtung=="links" && rot==0)
        {
            if(getOneObjectAtOffset(0,-1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,-1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if(richtung!="vorne" && richtung!="links" && richtung!="rechts")
        {
            nachricht("Befehl nicht korrekt!");
        }

        return false;
    }

    /**
     * Der Rover ermittelt den Wassergehalt des Gesteins auf seiner Position und gibt diesen auf dem Display aus.
     * Sollte kein Objekt der Klasse Gestein vorhanden sein, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void analysiereGestein()
    {
        if(gesteinVorhanden())
        {
            nachricht("Gestein untersucht! Wassergehalt ist " + ((Gestein)getOneIntersectingObject(Gestein.class)).getWassergehalt()+"%.");
            Greenfoot.delay(1);
            removeTouching(Gestein.class);
        }
        else 
        {
            nachricht("Hier ist kein Gestein");
        }
    }

    /**
     * Der Rover erzeugt ein Objekt der Klasse „Markierung“ auf seiner Position.
     */
    public void setzeMarke()
    {
        getWorld().addObject(new Marke(), getX(), getY());
    }

    /**
     * *Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Marke befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean markeVorhanden()
    {
        if(getOneIntersectingObject(Marke.class)!=null)
        {
            return true;
        }

        return false;
    }

    public void entferneMarke()
    {
        if(markeVorhanden())
        {
            removeTouching(Marke.class);
        }
    }

    private void nachricht(String pText)
    {
        if(anzeige!=null)
        {
            anzeige.anzeigen(pText);
            Greenfoot.delay(1);
            anzeige.loeschen();
        }
    }

    private void displayAusschalten()
    {
        getWorld().removeObject(anzeige);

    }

    protected void addedToWorld(World world)
    {

        setImage("images/rover.png");
        world = getWorld();
        anzeige = new Display();
        anzeige.setImage("images/nachricht.png");
        world.addObject(anzeige, 7, 0);
        if(getY()==0)
        {
            setLocation(getX(),1);
        }
        anzeige.anzeigen("Ich bin bereit");

    }

    class Display extends Actor
    {
        GreenfootImage bild; 

        public Display()
        {
          bild = getImage();
        }

     public void anzeigen(String pText)
        {
           loeschen();
           getImage().drawImage(new GreenfootImage(pText, 25, Color.BLACK, new Color(0, 0, 0, 0)),10,10);

        }

        public void loeschen()
        {
            getImage().clear();
            setImage("images/nachricht.png");
        }

    }
}
