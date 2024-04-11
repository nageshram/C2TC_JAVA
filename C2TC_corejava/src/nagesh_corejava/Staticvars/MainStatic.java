package nagesh_corejava.Staticvars;

public class MainStatic {
	public static void main(String args[])
	{
		Staticvar player1=new Staticvar("Nagesha",1);
		System.out.println(player1.toString()); //TeamScore=0
		Staticvar.addScore(); // it is static method : static fields and methods are accessed with classname
        // now teamScore=1
		
		Staticvar player2=new Staticvar("Nagesha",2);
		System.out.println(player2.toString()); //TeamScore=1
		Staticvar.addScore();
		
		player1.getScore();
		
		
	}
}
