//Pane Elenovski
//3/13/2018
//Circle Program
//Changes the appearance of a circle that is to be printed

import TurtleGraphics.Pen;

public class Circle extends Shape
{
    private double radius;


    public void draw(Pen p)
    {
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move (xPos + radius, yPos - side / 120.0);
        p.setDirection (90);
        p.down();
        for (int i = 0; i<120; i++)
        {
            p.move (side);
            p.turn(3);
        }   

    }


    public double getRadius()
    {
        return radius;
    }

    public void move(double xLoc, double yLoc)
    {
        
    }
    
    public void stretchby(double factor)
    {
        
    }
    
    public abstract double getArea()
    {
        double area = math.pow(radius, 2) * Math.PI;
        return area;
    }
    
    public abstract void draw(Pen p)
    {
        
    }
    
    public String toString()
    {
        return "The area of the circle is "+area;
    }
    
   
}//end of Circle