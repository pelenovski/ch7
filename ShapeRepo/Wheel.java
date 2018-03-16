//Pane Elenovski
//3/15/2018
//Wheel Program
//Forms a wheel made out of spokes

public class Wheel
{
    
    public int spoke()
    {
        System.out.println("Please enter the number of spokes you would like this wheel to have.");
        Scanner keyboard = new Scanner(System.in);
        
        //user enters the number of spokes for wheel
        int spokes = keyboard.nextInt();
        
        
        
    }
    public void draw(Pen p)
    {
        super.draw(p);
        
        //evenly spaces out the spokes to provide an asthetically pleasing spoke
        int d = 360/spokes;
        
        p.up();
        //draws spoke wheel based on coordinate position given
        p.draw(getXpos(), getYpos);
        
        p.setDirection(90);
        
        for (int i = 1; i <= numSpokes; i++)
        {
            //algorithm to move each spoke into position while maintaining-
            //-even spacing between spokes
            p.down();
            p.move(getRadius);
            p.up();
            p.move(getXpos(), getYpos());
            p.turn(degree);
        }
        
        
        
        
        
        
        
    }

}
