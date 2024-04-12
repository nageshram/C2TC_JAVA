package nagesh_corejava.wrapperClasses;

public class WrapperClass {
       /* Wrapper classes are non [primitive data types
        * We cannot use primitive data types as a object directly
        * This Wrapper classes will wrap the primitive data types
        * char- Character 2b
        * boolean - Boolean 2b
        * double- Double 8b
        * int - Integer 4b
        * float - Float 4b
        * byte - Byte 1b+
        * long - Long
        * x=25
        * example : Integer i = new Integer(x);  pass the primitive data to wrapper class constructor
        * y=i.intValue();
        * wrapper classes provides abstraction for primitive data types
        * When we need our details like objects then we use wrapper classes */
	    public static void main(String args[])
	    {
	    String s1="Nagesha";
	     String s2 = new String(s1);
	     char data[]= {'d','f', 'g'};
	     String str= new String(data);
	     System.out.println(s1+" "+s2+" "+data+" "+str); 
	    }/**Strings is immutable we can't modify it
	      * String methods 
	      * str.charAt(index); gets the character at the specified index
	      * endsWith() checks weather a string is ends with or not
	      * strtsWith()
	      * indexOf();
	      * "hello".substring(1,4); prints 'ell' end index will not included ' [ ) '
	      * String s= "Hardik Pandya"
	      * s.substring(7);  Pandya - here we have only start index so
	      * s.substring();   Hardik  [0,7)
	      * s1="Negative Thoughts";
	      * s1.replace('e','a');  // Nagativa Thoughts - replacess all occurences 
	      * s1.contains("Thougths"); True 
	      * s1.equalsIgnoreCase(s);
	      * length();
	      * replace(old,new)
	      * toLowerCase()
	      * toUpperCase()
	      * trim() remove white space from both ends
	      * reverseToCharArray() convert string to character array
	      * equals() check weather thetwo strings are equal or not 
	      * concat(str)
	      * string constant pool - SCP 
	      * heap will store the objects JVM finds the repeated string and make only one copy in the Heap
	      * StringBuffer class  creates of flexible length which can be modified
	      * StringBuffer class is mutable whereas string is constant we can't modify it.
 	      * StringBuffer is a final class
	      * StringBuffer sb1 = new StringBuffer();
	      * StringBuffer sb2 = new StringBuffer(5); // by default the size is 8 bytes but we can modify
	      * StringBuffer sb3 = new StringBuffer("Nagesh");
	      * above class supports 
	      * append()
	      * charAt(int index);
	      * replace(String);
	      * delete();
	      * indexOf(str,start_index);
	      * toString();
	      * fast and consumes less memory
	      * object class is the super class*/
}
 