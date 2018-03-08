
/**
 * Write a description of class blah here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
	//default constructor in dog comes from object
	private int weight;
	Dog ()
	{
		System.out.print("hi from dog");
	}

	Dog (String dogname, int weight)
	{
		super(dogname);
		this.weight = weight;
	}


	public int getWeight()
	{
		return weight;
	}

	public String toString()
	{
		return (super.toString()+" and I weigh "+weight+" pounds.");
	}



}


