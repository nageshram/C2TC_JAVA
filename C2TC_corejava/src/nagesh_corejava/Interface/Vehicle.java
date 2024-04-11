package nagesh_corejava.Interface;

public interface Vehicle {
   public String DrivingType="Offline Driver";
   // by default interface  fields are final and static
   // Multiple inheritence is achieved by Interface
   // to implement this interface we need to use the 'implements' keyword while implementing
   public void DisplayNumTyres();
   // By default methods in interface are public and abstract
   // interfaces don't have constructors
   // we can create multiple abstract classes by implementing this interface
   //interfaces achieve more abstraction
   //java is not completely object oriented programming language.
}
