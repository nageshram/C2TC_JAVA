package nagesh_corejava.Staticvars;

public class Staticvar {
      // we can't create static classes only public, final and abstract is allowed
	   protected static int TeamScore=0; // static variable
       public int playerId;
       public String playerName;
       
       public Staticvar()
       {
    	  // this.TeamScore=0; // we can't initialize static var in constructor because static variable is same for all objects( same memery buffer for all objects of class type Staticvar 
       }  
       public Staticvar(String playerName,int Id) {
   		this.playerId=Id;
   		this.playerName = playerName;
   	}
       public void getScore()
       {
    	   System.out.println("Playe Id = "+playerId+" Score = "+TeamScore);
       }
       static { // static block will be executed first when we create objects,only one object access these  block at a time
    	   
    	   TeamScore=0;
    	   System.out.println("***** Game started ****** \nTeam Score = "+TeamScore);
       }
       public static void addScore()
       {  //static method: we can't access non static member variables here 
    	   //but non static methods can access static fields
    	   TeamScore++;
    	   System.out.println("\nScore:"+TeamScore);
    	   //playerId=1; plyerId is non static field, each object have its own playerId but score is same for all objects.
       }
	public String toString() {
		return "Staticvar [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
       
}
