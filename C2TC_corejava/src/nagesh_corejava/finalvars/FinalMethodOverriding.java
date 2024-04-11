package nagesh_corejava.finalvars;

public class FinalMethodOverriding extends Finalmethods {
	public final String Name="Rama";
	
	//parent class also have the same method but it is defined as final
	/** cannot override the parent class method hence ERROR
	
	public void DisplayName()
	{
		System.out.println("Name = "+Name);
	}
	*/
	public void Display()
	{
		System.out.println("Name = "+Name);
	}
}
