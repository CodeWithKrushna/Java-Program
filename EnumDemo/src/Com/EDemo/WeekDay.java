package Com.EDemo;
enum Dayss
{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday
}
public class WeekDay
{

	public static void main(String[] args) 
	{
		for (Dayss DY: Dayss.values())
		{
			System.out.println(DY);
		}
		
	}

}
