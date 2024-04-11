package nagesh_corejava.finalvars;

public class MainclassFinal {
	
	public static void main(String args[])
	{
    
		/*****FINAL-FiELD********/
		
	finalClass fone= new finalClass();
	//fOne.CityName="Mumbai";  // we cant re-initialize the final fields :> final= constant
	System.out.println(fone.CityName);
	
	/*********Final-Methods**********/
	Finalmethods fthree=new Finalmethods();
	Finalmethods ftwo= new FinalMethodOverriding();
	System.out.println(ftwo.Name);// final Name field was overriden, prints 'Siya' parent class value
	System.out.println(fthree.Name); // Siya
	
	// final method can't be overriden and can't be written in inherit class
    // ftwo.Display();  // this method did'nt defined in the parent class hence we need to create object for only child class then only we can access the function 
	}
}
