
/**
 * Write a description of class blah here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab extends Dog
{
	private String color;

	public Lab(String DogName, int DogWeight, String LabColor)
	{
		super(dogName,DogWeight);
		color = LabColor;
	}

	public String toString()
	{
		return (super.toString()+" and he is the color "+color);
	}
}
