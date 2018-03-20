//Pane Elenovski
//3/15/2018
//Shape Lab
//Draws a shape by taking in given parameters

import TurtleGraphics.Pen;

public abstract class Shape
{
    private double xPos, yPos;

    public Shape ()
    {
        xPos = 0;
        yPos = 0;
    }
    
    public Shape (double x, double y)
    {
        xPos = x;
        yPos = y;
    }
    
    
    // you must write these methods here
    public double getXpos()
    {
        return xPos;
    }
    public double getYpos()
    {
        return yPos;
    }
    //public void move(double xLoc, double yLoc);
    // increase the size by the factor
    //public void stretchby (double factor);

    public abstract double getArea();
    
    public abstract void draw(Pen p);
    //toString should display xpos, ypos
    public String toString()
    {
        return ("The circle coordinates are"+getXpos()+","+getYpos());
    }

}//end of Shape
