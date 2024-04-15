package Com.EDemo;
enum Shape
{
	Cricle,Rectangle,Tringle
	
}
enum Days
{
	Sunday,Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
enum Direction
{
	north,
	south,
	East,
	West
}
public class EnumerationDemo
{

	public static void main(String[] args)
	{
		/*Direction di1=Direction.north;
		Direction di2=Direction.south;
		System.out.println("First Direction: " +di1);
		System.out.println("First Direction: " +di2);*/
		
		for (Direction dir: Direction.values())
		{
			System.out.println(dir);
		
		//Direction di1=Direction.north;
		//Days di11=Days.Friday;	
		}
		for(Shape sh: Shape.values()) 
		{
			System.out.println(sh);
		}
	}
}

